package com.example.hangman

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
        val solution = "banana"
        var solutionstring = "banana"
        var guessedstring = ""
        var isRight: Boolean
        sharedViewModel.numHint.value = 0
        /* if our solution contains the character, we remove from solution string
            once solution string is empty, the game is won */
        hintButton.setOnClickListener {
            var falseIndex:Int = sharedViewModel.falseIndex.value!!
            var numHint = sharedViewModel.numHint.value
            when (numHint) {
                0 -> {
                    hintText.setText("HINT: Food")
                    hintButton.setText("Show Hint 2")
                    numHint++
                    sharedViewModel.numHint.value = numHint
                }
                1 -> {
                    if (falseIndex >= 9) {
                        Toast.makeText(
                            getActivity(),
                            "HINT UNAVAILABLE, COST A TURN",
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        hintButton.setText("Show Hint 3")
                        numHint++
                        sharedViewModel.numHint.value = numHint
                        hint2()
                        sharedViewModel.guess.value = false
                    }
                }
                2 -> {
                    if (falseIndex >= 9) {
                        Toast.makeText(
                            getActivity(),
                            "HINT UNAVAILABLE, COST A TURN",
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
        var remainingLetters = sharedViewModel.remaining.value!!.filter { !sharedViewModel.solution.value!!.contains(it)}.toMutableList()

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
        var remainingLetters = sharedViewModel.remaining.value!!
        val vowelsToReveal = vowels.filter { remainingLetters.contains(it)}

        for (vowel in vowelsToReveal) {
            remainingLetters.remove(vowel)
            sharedViewModel.vowel.value = vowel
            sharedViewModel.disableLetter.value = vowel.toString()
        }
    }
}