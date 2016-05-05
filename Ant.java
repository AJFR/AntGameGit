/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.util.ArrayList;

/**
 *
 * @author ajfr20
 */
class Ant {

    public final int id;
    final int colour;
    boolean isAlive;
    Cell currentCell;
    int direction;
    private int state;
    private AntBrainReader antBrainReader;
    ArrayList<String> fsa;

    public Ant(int antID, int colour, int direction) {
        antBrainReader = new AntBrainReader();
        state = 0;
        id = antID;
        this.colour = colour;
        isAlive = true;
        this.direction = direction;
        fsa = antBrainReader.getFSA();
    }

    public String nextMove() {
        return fsa.get(state);
    }

    public void incrementState() {
        state++;
    }

    public String getInstruction() {
        return fsa.get(state);
    }

    int getColour() {
        return colour;
    }
}
