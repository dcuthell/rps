package models;

import java.util.Random;

/**
 * Created by Guest on 8/1/17.
 */
public class compTurn {

    Random randomTurn = new Random();
    String[] optionArray = {"rock", "paper", "scissors"};

    public String comp() {
        String output = optionArray[randomTurn.nextInt(3)];
        return output;
    }
}
