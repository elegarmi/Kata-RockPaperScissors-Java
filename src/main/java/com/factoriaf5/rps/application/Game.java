package com.factoriaf5.rps.application;

// import com.factoriaf5.rps.models.*;

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
    
    // String paperOrRock(String paper, String rock) { 

    //     if(paper == "Paper" && rock == "Rock") {
    //         return paper + " wins";
    //     }

    //     return "Error";
    // }

    // String rockOrScissors(String rock, String scissors) { 
    //     if(rock == "Rock" && scissors == "Scissors") {
    //         return rock + " wins";
    //     }

    //     return "Error";
    // }

    // String scissorsOrPaper(String scissors, String paper) {
    //     if(scissors == "Scissors" && paper == "Paper") {
    //         return scissors + " wins";
    //     }

    //     return "Error";
    // }
}
