package com.example.hanoipuzlle

class GameLogic {

    //Im niższa pozycja tym wyższy punkt wieży 0 -szczyt, ostani element - dół wieży
    private var gameState = mutableListOf<Int>(0,0,0,0)

    //Zwraca obecny rozmiar wieży
    fun towerSize(): Int {
        return gameState.size
    }

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
        for (i in 0 until segment) {
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

    //sprawdzanie warunków zwycięstwa; easyMode = false - tylko umieszczenie wszystkich elementów na ostatniej wieży oznacza zwycięstwo
    fun winCondition(easyMode: Boolean): Boolean {
        if(easyMode) {
            for(i in 1 until gameState.size) {
                if(gameState[i]!=gameState[0]) {return false}
            }
        }else {
            for(i in 0 until gameState.size) {
                if(gameState[i]!=2) {return false}
            }
        }
        return true
    }
}