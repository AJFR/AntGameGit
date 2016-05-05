/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * The 'Game engine' of the Ant game that executes the simulation
 * @author mfm29
 */
class antGameProcessor {

    private ArrayList<Ant> ants;
    int antNo;
    int round;
    Ant nextAnt;
    World world;
    Random rand;

    /**
     * Initialises a new simulation
     */
    public antGameProcessor() {
        ants = new ArrayList<Ant>();
        round = 1;
        antNo = 0;
        rand = new Random(10);


        world = new World();

        int id = 0;
        for (int i = 0; i < 50; i++) {
            ants.add(new Ant(id, 0, 0));
            id++;
        }
        for (int i = 50; i < 100; i++) {
            ants.add(new Ant(id, 1, 0));
            id++;
        }
        nextAnt = ants.get(0);
        excecuteGame();
    }

    /**
     * Executes the simulation.  
     */
    private void excecuteGame() {
        for (int i = 0; i < 300000; i++) {
            commenceRound();
            antNo = 0;
        }
    }

    /**
     * Executes the next state of each ant in the simulation for one round
     */
    private void commenceRound() {
        for (int i = 0; i < ants.size(); i++) {
            nextMove(nextAnt);
            antNo++;
            nextAnt = ants.get(antNo);
        }
    }

    /**
     * 
     * @param nextAnt The ant to move next in the game
     */
    private void nextMove(Ant nextAnt) {
        String instruction = nextAnt.getInstruction();
        excecuteInstruction(nextAnt, instruction);
    }

    /**
     * Has the next ant to be played execute the next instruction on it's finite state machine
     */
    private void excecuteInstruction(Ant nextAnt, instructions) {
        if (instructions.get(0) instanceof Flip) {
            flipInstruction(instructions);
        }
    }

}
