package com.example.hangman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class Hang : Fragment() {
    private val sharedViewModel: SharedViewModel by activityViewModels()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.hang, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textview: TextView = view.findViewById(R.id.textview)
        val foodBank = listOf("apple", "banana", "orange")
        var solutionIndex: Int? = sharedViewModel.solutionIndex.value

        // revert everything to default when we click new game
        val newGame: Button = view.findViewById(R.id.newGame)
        newGame.setOnClickListener {
            sharedViewModel.falseIndex.value = 4
            view.findViewById<ImageView?>(R.id.imageView)?.setImageResource(R.drawable.hang_4)
            // change solution
            Log.d("index", solutionIndex.toString())
            solutionIndex = if (solutionIndex == foodBank.size-1) {
                0
            } else {
                solutionIndex!! + 1
            }
            Log.d("index", solutionIndex.toString())
            sharedViewModel.solution.value = foodBank[solutionIndex!!]
            sharedViewModel.solutionIndex.value = solutionIndex
            sharedViewModel.enableButtons.value = true
            sharedViewModel.guessedString.value = ""
            sharedViewModel.remaining.value = ('a'..'z').toMutableList()
            sharedViewModel.numHint.value = 0
            textview.text = ""
        }

        sharedViewModel.guess.observe(viewLifecycleOwner) { data ->
            // we change the hangman view based on the false answer
            var falseIndex = sharedViewModel.falseIndex.value
            if (data == false) {
                falseIndex = falseIndex!! + 1
                when (falseIndex) {
                    5 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_5)
                    }
                    6 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_6)
                    }
                    7 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_7)
                    }
                    8 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_8)
                    }
                    9 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_9)
                    }
                    10 -> {
                        view.findViewById<ImageView?>(R.id.imageView)
                            ?.setImageResource(R.drawable.hang_10)
                    }
                }
                sharedViewModel.falseIndex.value = falseIndex;
            }
        }

        sharedViewModel.guessedString.observe(viewLifecycleOwner) { data ->
            textview.text = data
        }

        val solution = foodBank[solutionIndex!!]
        sharedViewModel.solution.value = solution
        var default = ""
        for (i in solution)
        {
            default += "_"
        }
        textview.text = default
    }
}