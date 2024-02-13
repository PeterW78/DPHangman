package com.example.hangman

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kotlin.random.Random


class Hint : Fragment(R.layout.hint)
{
    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.hint, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hintButton: Button = view.findViewById(R.id.showHint)
        val hintText: TextView = view.findViewById(R.id.hintMsg)

        // we can only see on landscape
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            hintButton.visibility = View.VISIBLE
            hintText.visibility = View.VISIBLE
        } else {
            hintButton.visibility = View.GONE
            hintText.visibility = View.GONE
        }

        hintButton.setOnClickListener {
            val falseIndex = sharedViewModel.falseIndex.value!!
            var numHint = sharedViewModel.numHint.value
            when (numHint) {
                0 -> {
                    hintText.text = getString(R.string.hint_food)
                    hintButton.text = getString(R.string.show_hint_2)
                    numHint++
                    sharedViewModel.numHint.value = numHint
                }
                1 -> {
                    if (falseIndex >= 9) {
                        Toast.makeText(
                            activity,
                            getString(R.string.hint_unavailable),
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        hintButton.text = getString(R.string.show_hint_3)
                        numHint++
                        sharedViewModel.numHint.value = numHint
                        hint2()
                        sharedViewModel.guess.value = false
                    }
                }
                2 -> {
                    if (falseIndex >= 9) {
                        Toast.makeText(
                            activity,
                            getString(R.string.hint_unavailable),
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        hintButton.isEnabled = false
                        sharedViewModel.guess.value = false
                        hint3()
                    }
                }
            }
        }
    }

    private fun hint2() {
        val remainingLetters = sharedViewModel.remaining.value!!.filter { !sharedViewModel.solution.value!!.contains(it)}.toMutableList()

        val remainingLettersCount = remainingLetters.size
        val lettersToDisable = remainingLettersCount / 2

        for (i in 0 until lettersToDisable) {
            val rand = Random.nextInt(remainingLetters.size)
            val letter = remainingLetters[rand]
            sharedViewModel.disableLetter.value = letter.toString()
            remainingLetters.removeAt(rand)
        }
        sharedViewModel.remaining.value = remainingLetters
    }

    private fun hint3() {
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        val remainingLetters = sharedViewModel.remaining.value!!
        val vowelsToReveal = vowels.filter { remainingLetters.contains(it)}

        for (vowel in vowelsToReveal) {
            remainingLetters.remove(vowel)
            sharedViewModel.vowel.value = vowel
            sharedViewModel.disableLetter.value = vowel.toString()
        }
    }
}