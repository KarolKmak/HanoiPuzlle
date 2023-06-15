package com.example.hanoipuzlle

class GameLogic {

    //Im niższa pozycja tym wyższy punkt wieży 0 -szczyt, ostani element - dół wieży
    private var gameState = mutableListOf<Int>(0,0,0,0)

    //Odczytanie wartości poziomu najwyższego elementu wybranej wieży
    fun getState (tower: Int): Int {
        for (i in 0 until gameState.size) {
            if (gameState[i] == tower) {
                //zwrócenie wysokości segmentu
                return i
            }
        }
        //zwrócenie wartości -1 - brak segmentów w danej wieży
        return -1
    }

    //Sprawdzenie czy można przesunąć segment na określoną wieżę
    fun canChange(segment: Int,tower: Int): Boolean {
        for (i in 0 until segment){
            if(gameState[i] == tower){
                return false
            }
        }
        return true
    }

    //Zmiana pozycji segmentu wieży; użyć canChange() wcześniej by sprawdzić czy ruch jest dopuszczalny
    fun changeState(segment: Int, tower: Int) {
        gameState[segment] = tower
    }

    //ToDo


}