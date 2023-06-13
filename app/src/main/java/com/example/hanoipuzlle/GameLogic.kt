package com.example.hanoipuzlle

class GameLogic {

    //Im niższa pozycja tym wyższy punkt wieży
    private var gameState = mutableListOf<Int>(0,0,0,0)

    //Odczytanie wartości poziomu najwyższego elementu wybranej wieży
    fun getState (tower: Int): Int {
        for (i in 0 until gameState.size) {
            if (gameState[i] == tower) {
                //zwrócenie numeru segmentu
                return i
                break
            }
        }
        //zwrócenie niewłaściwego numeru wieży - nie ma żadnego elementu w wybranej wieży
        return 3
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