package models;

/**
 * Created by Guest on 8/1/17.
 */
public class Game {

    public String pickWinner (String one, String two) {

        if(one.equals(two)){
            return "Nobody";
        } else if (one.equals("rock") && (two.equals("paper"))) {
            return "Player 2 wins!";
        } else if (one.equals("rock") && (two.equals("scissors"))) {
            return "Player 1 wins!";
        } else if (one.equals("paper") && (two.equals("rock"))) {
            return "Player 1 wins!";
        } else if (one.equals("paper") && (two.equals("scissors"))) {
            return "Player 2 wins!";
        } else if (one.equals("scissors") && (two.equals("rock"))) {
            return "Player 2 wins!";
        } else if (one.equals("scissors") && (two.equals("paper"))) {
            return "Player 1 wins!";
        } else {
            return "somebody";
        }
    }

    public String computerChooses(){
        return "Sup doawgggggggg";
    }
}
