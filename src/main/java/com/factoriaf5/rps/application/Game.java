package com.factoriaf5.rps.application;

public class Game {
    public String play(String player1, String player2) {
        String winner = this.checkWinner(player1, player2);
        return winner;      
    }

    public String checkWinner(String obj1, String obj2) {
        if(obj1.equals("Paper") && obj2.equals("Rock")) {
            return obj1 + " wins";
        }

        if(obj1.equals("Rock") && obj2.equals("Scissors")) {
            return obj1 + " wins";
        }

        if(obj1.equals("Scissors") && obj2.equals("Paper")) {
            return obj1 + " wins";
        }

        return "Draw";
    }
}