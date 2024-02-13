package com.example.hangman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels

class Letters : Fragment() {
    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.letters, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val abutton: Button = view.findViewById(R.id.a)
        val bbutton: Button = view.findViewById(R.id.b)
        val cbutton: Button = view.findViewById(R.id.c)
        val dbutton: Button = view.findViewById(R.id.d)
        val ebutton: Button = view.findViewById(R.id.e)
        val fbutton: Button = view.findViewById(R.id.f)
        val gbutton: Button = view.findViewById(R.id.g)
        val hbutton: Button = view.findViewById(R.id.h)
        val ibutton: Button = view.findViewById(R.id.i)
        val jbutton: Button = view.findViewById(R.id.j)
        val kbutton: Button = view.findViewById(R.id.k)
        val lbutton: Button = view.findViewById(R.id.l)
        val mbutton: Button = view.findViewById(R.id.m)
        val nbutton: Button = view.findViewById(R.id.n)
        val obutton: Button = view.findViewById(R.id.o)
        val pbutton: Button = view.findViewById(R.id.p)
        val qbutton: Button = view.findViewById(R.id.q)
        val rbutton: Button = view.findViewById(R.id.r)
        val sbutton: Button = view.findViewById(R.id.s)
        val tbutton: Button = view.findViewById(R.id.t)
        val ubutton: Button = view.findViewById(R.id.u)
        val vbutton: Button = view.findViewById(R.id.v)
        val wbutton: Button = view.findViewById(R.id.w)
        val xbutton: Button = view.findViewById(R.id.x)
        val ybutton: Button = view.findViewById(R.id.y)
        val zbutton: Button = view.findViewById(R.id.z)

        // checks if our guess if right or not
        var isRight: Boolean
        // the remaining letters we need to guess
        var remainingLetters : MutableList<Char> = sharedViewModel.remaining.value!!
        /* if our solution contains the character, we remove from solution string
            once solution string is empty, the game is won */

        abutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            var remainingLetters : MutableList<Char> = sharedViewModel.remaining.value!!
            if (solution.contains("a")) {
                //sharedViewModel.letter.value = "a"
                Log.d("string", guessedstring)
                guessedstring = updateString(solution, "a", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('a')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            abutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        bbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("b")) {
                sharedViewModel.letter.value = "b"
                guessedstring = updateString(solution, "b", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('b')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            bbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        cbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("c")) {
                sharedViewModel.letter.value = "c"
                guessedstring = updateString(solution, "c", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('c')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            cbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        dbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("d")) {
                sharedViewModel.letter.value = "d"
                guessedstring = updateString(solution, "d", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('d')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            dbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        ebutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("e")) {
                sharedViewModel.letter.value = "e"
                guessedstring = updateString(solution, "e", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('e')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            ebutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        fbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("f")) {
                sharedViewModel.letter.value = "f"
                guessedstring = updateString(solution, "f", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('f')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            fbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        gbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("g")) {
                sharedViewModel.letter.value = "g"
                guessedstring = updateString(solution, "g", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('g')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            gbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        hbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("h")) {
                sharedViewModel.letter.value = "h"
                guessedstring = updateString(solution, "h", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('h')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            hbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        ibutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("i")) {
                sharedViewModel.letter.value = "i"
                guessedstring = updateString(solution, "i", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('i')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            ibutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        jbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("j")) {
                sharedViewModel.letter.value = "j"
                guessedstring = updateString(solution, "j", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('j')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            jbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        kbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("k")) {
                sharedViewModel.letter.value = "k"
                guessedstring = updateString(solution, "k", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('k')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            kbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        lbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("l")) {
                sharedViewModel.letter.value = "l"
                guessedstring = updateString(solution, "l", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('l')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            lbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        mbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("m")) {
                sharedViewModel.letter.value = "m"
                guessedstring = updateString(solution, "m", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('m')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            mbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        nbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("n")) {
                sharedViewModel.letter.value = "n"
                guessedstring = updateString(solution, "n", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('n')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            nbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        obutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("o")) {
                sharedViewModel.letter.value = "o"
                guessedstring = updateString(solution, "o", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('o')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            obutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        pbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("p")) {
                sharedViewModel.letter.value = "p"
                guessedstring = updateString(solution, "p", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('p')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            pbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        qbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("q")) {
                sharedViewModel.letter.value = "q"
                guessedstring = updateString(solution, "q", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('q')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            qbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        rbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("r")) {
                sharedViewModel.letter.value = "r"
                guessedstring = updateString(solution, "r", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('r')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            rbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        sbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("s")) {
                sharedViewModel.letter.value = "s"
                guessedstring = updateString(solution, "s", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('s')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            sbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        tbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("t")) {
                sharedViewModel.letter.value = "t"
                guessedstring = updateString(solution, "t", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('t')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            tbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        ubutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("u")) {
                sharedViewModel.letter.value = "u"
                guessedstring = updateString(solution, "u", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('u')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            ubutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        vbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("v")) {
                sharedViewModel.letter.value = "v"
                guessedstring = updateString(solution, "v", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('v')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            vbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        wbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("w")) {
                sharedViewModel.letter.value = "w"
                guessedstring = updateString(solution, "w", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('w')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            wbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        xbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("x")) {
                sharedViewModel.letter.value = "x"
                guessedstring = updateString(solution, "x", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('x')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            xbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        ybutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("y")) {
                sharedViewModel.letter.value = "y"
                guessedstring = updateString(solution, "y", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('y')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            ybutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }
        zbutton.setOnClickListener {
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            if (solution.contains("z")) {
                sharedViewModel.letter.value = "z"
                guessedstring = updateString(solution, "z", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                remainingLetters.remove('z')
                sharedViewModel.remaining.value = remainingLetters
                isRight = true
            } else {
                isRight = false
            }
            zbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
            checkWin(solution)
        }

        sharedViewModel.disableLetter.observe(viewLifecycleOwner) { data ->
            val buttonId = resources.getIdentifier(data, "id", requireContext().packageName)
            val button: Button = view.findViewById(buttonId)
            button.isEnabled = false
        }

        sharedViewModel.vowel.observe(viewLifecycleOwner) { data ->
            val solution = sharedViewModel.solution.value!!
            var guessedstring = sharedViewModel.guessedString.value!!
            val vowel = data.toString()
            guessedstring = updateString(solution, vowel, guessedstring)
            sharedViewModel.guessedString.value = guessedstring
        }

        sharedViewModel.enableButtons.observe(viewLifecycleOwner) { data ->
            abutton.isEnabled = data
            bbutton.isEnabled = data
            cbutton.isEnabled = data
            dbutton.isEnabled = data
            ebutton.isEnabled = data
            fbutton.isEnabled = data
            gbutton.isEnabled = data
            hbutton.isEnabled = data
            ibutton.isEnabled = data
            jbutton.isEnabled = data
            kbutton.isEnabled = data
            lbutton.isEnabled = data
            mbutton.isEnabled = data
            nbutton.isEnabled = data
            obutton.isEnabled = data
            pbutton.isEnabled = data
            qbutton.isEnabled = data
            rbutton.isEnabled = data
            sbutton.isEnabled = data
            tbutton.isEnabled = data
            ubutton.isEnabled = data
            vbutton.isEnabled = data
            wbutton.isEnabled = data
            xbutton.isEnabled = data
            ybutton.isEnabled = data
            zbutton.isEnabled = data
        }

    }

    private fun checkWin(solution : String)
    {
        val guessedSoFar = sharedViewModel.guessedString.value!!
        val guessed : String = updateString(solution, "", guessedSoFar)
        if (guessed == solution) {
            Toast.makeText(
                activity,
                getString(R.string.you_win),
                Toast.LENGTH_LONG
            ).show()
        }
        val falseIndex:Int = sharedViewModel.falseIndex.value!!
        Log.w("TEST", "TESTSET: $falseIndex")
        if (falseIndex >= 10 )
        {
            Toast.makeText(
                activity,
                getString(R.string.you_lost),
                Toast.LENGTH_LONG
            ).show()
        }
    }
    private fun updateString(solution: String, character: String, guessedSoFar: String): String {
        val fullstring = guessedSoFar + character
        val fullstringList = fullstring.toList()
        val guessList = MutableList(solution.length) { '_' }
        val solutionList = solution.toList()
        for (i in solutionList.indices) {
            for (j in fullstringList.indices) {
                if (solution[i] == fullstringList[j]) {
                    if (guessList[i] == '_') {
                        guessList[i] =  fullstringList[j]
                    }
                }
            }
        }
        return guessList.joinToString("")
    }
}
