package kyu8.rockPaperScissors;

public class RockPaperScissors {
    public static void main(String[] args) {

    }

    public static String ppt(String p1, String p2) {

        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1 == "scissors" && p2 == "paper") {
            return "player 1 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "player 1 won!";
        } else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        } else {
            return "player 2 won!";
        }
    }

}