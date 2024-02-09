package com.example.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Letters : Fragment(R.layout.letters) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val abutton: Button? = view?.findViewById(R.id.a)
        var solutionstring: String = "Banana"
        var isRight: Boolean = true
        /* if our solution contains the character, we remove from solution string
            once solution string is empty, the game is won */
        abutton?.setOnClickListener {
            if (solutionstring.contains('a')) {
                 solutionstring = solutionstring.replace("a", "")
             } else {
                 abutton.isEnabled = false
             }
        }
        return inflater.inflate(R.layout.letters, container, false)

    }
}
