import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean programRunning = true;

        Game RPS = new Game();

        while (programRunning) {

            try {
                System.out.println("Welcome to Rock/Paper/Scissors extreme!!");
                System.out.println("Do you want to play? Enter: 'y' or 'n' ");
                String navChoice = bufferedReader.readLine().toLowerCase();

                if (navChoice.equals("y")) {
                    System.out.println("User 1: Rock, Paper, or Scissors?");
                    String user1 = bufferedReader.readLine().toLowerCase();
                    System.out.println("User 2: Rock, Paper, or Scissors?");
                    String user2 = bufferedReader.readLine().toLowerCase();

                    System.out.println( RPS.pickWinner(user1, user2) );
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
