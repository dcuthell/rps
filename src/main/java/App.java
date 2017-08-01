import models.Game;
import models.compTurn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;

        Game RPS = new Game();
        compTurn computer = new compTurn();

        System.out.println("Welcome to Rock/Paper/Scissors extreme!!");

        while (programRunning) {

            try {

                System.out.println("Do you want to play? Enter: 'y' or 'n' ");
                String navChoice = bufferedReader.readLine().toLowerCase();

                if (navChoice.equals("y")) {
                    System.out.println("One player, or Two?");
                    String players = bufferedReader.readLine().toLowerCase();
                    if (players.equals("one")) {
                        System.out.println("Human: Rock, Paper, or scissors?");
                        String humanInput = bufferedReader.readLine().toLowerCase();
                        String computerInput = computer.comp();

                        System.out.println(RPS.pickWinner(humanInput, computerInput) );

                    } else if (players.equals("two")) {
                        System.out.println("User 1: Rock, Paper, or Scissors?");
                        String user1 = bufferedReader.readLine().toLowerCase();
                        System.out.println("User 2: Rock, Paper, or Scissors?");
                        String user2 = bufferedReader.readLine().toLowerCase();

                        System.out.println( RPS.pickWinner(user1, user2) );
                    }
                } else {
                    System.out.println("Adios, mothafucka!");
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
