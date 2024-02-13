package com.example.hangman

import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    // true if we guessed right
    var guess = MutableLiveData<Boolean>()
    // the letter we just guessed
    var letter = MutableLiveData<String>()
    // the entire string we have guessed that is right
    var guessedString = MutableLiveData<String>().apply { value = "" }
    // true if we have won, false if we lose
    var hasWon = MutableLiveData<Boolean>()
    // number of lives
    var falseIndex = MutableLiveData<Int>().apply {value = 4}
    // number of hints pressed
    var numHint = MutableLiveData<Int>()
    // solution string
    var solution = MutableLiveData<String>()
    // list of remaining characters
    var remaining = MutableLiveData<MutableList<Char>>(). apply { value = ('a'..'z').toMutableList() }
    // disable letter
    var disableLetter = MutableLiveData<String>()
    // vowel to reveal
    var vowel = MutableLiveData<Char>()
    // enable all buttons after reset
    var enableButtons = MutableLiveData<Boolean>()
    // get solutionIndex
    var solutionIndex = MutableLiveData<Int>().apply {value = 0}
}
