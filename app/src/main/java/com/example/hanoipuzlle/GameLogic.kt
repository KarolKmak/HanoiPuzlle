package com.example.hanoipuzlle

class GameLogic {

    //Im niższa pozycja tym wyższy punkt wieży
    private var gameState = mutableListOf<Int>(0,0,0,0)

    //Odczytanie wartości danego poziomu wieży
    fun getState (i: Int): Int {
        return gameState[i]
    }

    //Sprawdzenie czy można przesunąć segment na określoną pozycję
    fun canChange(place: Int,value: Int): Boolean {
        for (i in 0 until place){
            if(gameState[i] == value){
                return false
            }
        }
        return true
    }

    //Zmiana pozycji segmentu wieży
    fun changeState(place: Int, value: Int) {
        gameState[place] = value
    }

    //ToDo


}