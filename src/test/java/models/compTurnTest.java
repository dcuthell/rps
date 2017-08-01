package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class compTurnTest {
    @Test
    public void comp_shouldBeRandom_true() throws Exception {

        int rocks = 0;
        int papers = 0;
        int scissors = 0;


        for(int i = 0; i < 4567890; i++){
            System.out.println(i);
            compTurn cpu = new compTurn();
            String tstThis = cpu.comp();
            if(cpu.comp().equals("rock")){
                rocks++;
            }
            else if(cpu.comp().equals("paper")){
                papers++;
            }
            else if(cpu.comp().equals("scissors")){
                scissors++;
            }
        }
        System.out.println("Rocks: " + rocks + " Papers: " + papers + " Scissors: " + scissors);
        Boolean result = (rocks == papers && papers == scissors);
        assertEquals(true, result);
    }
}