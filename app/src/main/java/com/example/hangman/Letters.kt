package com.example.hangman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        val solution = "banana"
        var solutionstring = "banana"
        var guessedstring = ""
        var isRight: Boolean

        /* if our solution contains the character, we remove from solution string
            once solution string is empty, the game is won */
        abutton.setOnClickListener {
            if (solutionstring.contains("a")) {
                solutionstring = solutionstring.replaceFirst("a", "")
                sharedViewModel.letter.value = "a"
                guessedstring = updateString(solution, "a", guessedstring)
                sharedViewModel.guessedString.value =guessedstring
                isRight = true
            } else {
                isRight = false
            }
            abutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        bbutton.setOnClickListener {
            if (solutionstring.contains("b")) {
                solutionstring = solutionstring.replaceFirst("b", "")
                sharedViewModel.letter.value = "b"
                guessedstring = updateString(solution, "b", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            bbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        cbutton.setOnClickListener {
            if (solutionstring.contains("c")) {
                solutionstring = solutionstring.replaceFirst("c", "")
                sharedViewModel.letter.value = "c"
                guessedstring = updateString(solution, "c", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            cbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        dbutton.setOnClickListener {
            if (solutionstring.contains("d")) {
                solutionstring = solutionstring.replaceFirst("d", "")
                sharedViewModel.letter.value = "d"
                guessedstring = updateString(solution, "d", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            dbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        ebutton.setOnClickListener {
            if (solutionstring.contains("e")) {
                solutionstring = solutionstring.replaceFirst("e", "")
                sharedViewModel.letter.value = "e"
                guessedstring = updateString(solution, "e", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            ebutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        fbutton.setOnClickListener {
            if (solutionstring.contains("f")) {
                solutionstring = solutionstring.replaceFirst("f", "")
                sharedViewModel.letter.value = "f"
                guessedstring = updateString(solution, "f", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            fbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        gbutton.setOnClickListener {
            if (solutionstring.contains("g")) {
                solutionstring = solutionstring.replaceFirst("g", "")
                sharedViewModel.letter.value = "g"
                guessedstring = updateString(solution, "g", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            gbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        hbutton.setOnClickListener {
            if (solutionstring.contains("h")) {
                solutionstring = solutionstring.replaceFirst("h", "")
                sharedViewModel.letter.value = "h"
                guessedstring = updateString(solution, "h", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            hbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        ibutton.setOnClickListener {
            if (solutionstring.contains("i")) {
                solutionstring = solutionstring.replaceFirst("i", "")
                sharedViewModel.letter.value = "i"
                guessedstring = updateString(solution, "i", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            ibutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        jbutton.setOnClickListener {
            if (solutionstring.contains("j")) {
                solutionstring = solutionstring.replaceFirst("j", "")
                sharedViewModel.letter.value = "j"
                guessedstring = updateString(solution, "j", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            jbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        kbutton.setOnClickListener {
            if (solutionstring.contains("k")) {
                solutionstring = solutionstring.replaceFirst("k", "")
                sharedViewModel.letter.value = "k"
                guessedstring = updateString(solution, "k", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            kbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        lbutton.setOnClickListener {
            if (solutionstring.contains("l")) {
                solutionstring = solutionstring.replaceFirst("l", "")
                sharedViewModel.letter.value = "l"
                guessedstring = updateString(solution, "l", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            lbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        mbutton.setOnClickListener {
            if (solutionstring.contains("m")) {
                solutionstring = solutionstring.replaceFirst("m", "")
                sharedViewModel.letter.value = "m"
                guessedstring = updateString(solution, "m", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            mbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        nbutton.setOnClickListener {
            if (solutionstring.contains("n")) {
                solutionstring = solutionstring.replaceFirst("n", "")
                sharedViewModel.letter.value = "n"
                guessedstring = updateString(solution, "n", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            nbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        obutton.setOnClickListener {
            if (solutionstring.contains("o")) {
                solutionstring = solutionstring.replaceFirst("o", "")
                sharedViewModel.letter.value = "o"
                guessedstring = updateString(solution, "o", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            obutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        pbutton.setOnClickListener {
            if (solutionstring.contains("p")) {
                solutionstring = solutionstring.replaceFirst("p", "")
                sharedViewModel.letter.value = "p"
                guessedstring = updateString(solution, "p", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            pbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        qbutton.setOnClickListener {
            if (solutionstring.contains("q")) {
                solutionstring = solutionstring.replaceFirst("q", "")
                sharedViewModel.letter.value = "q"
                guessedstring = updateString(solution, "q", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            qbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        rbutton.setOnClickListener {
            if (solutionstring.contains("r")) {
                solutionstring = solutionstring.replaceFirst("r", "")
                sharedViewModel.letter.value = "r"
                guessedstring = updateString(solution, "r", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            rbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        sbutton.setOnClickListener {
            if (solutionstring.contains("s")) {
                solutionstring = solutionstring.replaceFirst("s", "")
                sharedViewModel.letter.value = "s"
                guessedstring = updateString(solution, "s", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            sbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        tbutton.setOnClickListener {
            if (solutionstring.contains("t")) {
                solutionstring = solutionstring.replaceFirst("t", "")
                sharedViewModel.letter.value = "t"
                guessedstring = updateString(solution, "t", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            tbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        ubutton.setOnClickListener {
            if (solutionstring.contains("u")) {
                solutionstring = solutionstring.replaceFirst("u", "")
                sharedViewModel.letter.value = "u"
                guessedstring = updateString(solution, "u", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            ubutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        vbutton.setOnClickListener {
            if (solutionstring.contains("v")) {
                solutionstring = solutionstring.replaceFirst("v", "")
                sharedViewModel.letter.value = "v"
                guessedstring = updateString(solution, "v", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            vbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        wbutton.setOnClickListener {
            if (solutionstring.contains("w")) {
                solutionstring = solutionstring.replaceFirst("w", "")
                sharedViewModel.letter.value = "w"
                guessedstring = updateString(solution, "w", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            wbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        xbutton.setOnClickListener {
            if (solutionstring.contains("x")) {
                solutionstring = solutionstring.replaceFirst("x", "")
                sharedViewModel.letter.value = "x"
                guessedstring = updateString(solution, "x", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            xbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        ybutton.setOnClickListener {
            if (solutionstring.contains("y")) {
                solutionstring = solutionstring.replaceFirst("y", "")
                sharedViewModel.letter.value = "y"
                guessedstring = updateString(solution, "y", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            ybutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        zbutton.setOnClickListener {
            if (solutionstring.contains("z")) {
                solutionstring = solutionstring.replaceFirst("z", "")
                sharedViewModel.letter.value = "z"
                guessedstring = updateString(solution, "z", guessedstring)
                sharedViewModel.guessedString.value = guessedstring
                isRight = true
            } else {
                isRight = false
            }
            zbutton.isEnabled = false
            sharedViewModel.guess.value = isRight
        }
        if (solutionstring == "") {
            var hasWon = true
        }
    }

    private fun updateString(solution: String, character: String, guessedSoFar: String): String {
        val fullstring = guessedSoFar + character
        val fullstringList = fullstring.toList()
        val guessList = mutableListOf(' ', ' ', ' ', ' ', ' ', ' ')
        val solutionList = solution.toList()
        for (i in solutionList.indices) {
            for (j in fullstringList.indices) {
                if (solution[i] == fullstringList[j]) {
                    if (guessList[i] == ' ') {
                        guessList.add(i, fullstringList[j])
                    }
                }
            }
        }
        return guessList.joinToString("")
    }
}
