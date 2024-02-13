package com.example.hangman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        var falseIndex = 5
        sharedViewModel.falseIndex.value = falseIndex;

        sharedViewModel.guess.observe(viewLifecycleOwner) { data ->
            if (data == false) {
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
                falseIndex ++
            }
        }
        sharedViewModel.guessedString.observe(viewLifecycleOwner) { data ->
            textview.text = data
        }

        val solution = "banana"
        sharedViewModel.solution.value = solution
        var default = ""
        for (i in solution)
        {
            default += "_"
        }
        textview.text = default
    }
}