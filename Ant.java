/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

/**
 *
 * @author mfm29
 */
public class Ant {

    boolean colour;
    String id;
    int resting, direction, currentState;
    boolean has_food;

    /**
     * 
     * @param colour colour of the ant, blue if true, false otherwise
     * @param id The unique ID of he ant.
     */
    public Ant(boolean colour, String id) {
        this.colour = colour;
        this.id = id;
        resting = 0;
        direction = 0;
        has_food = false;
        currentState = 0;
    }
    
    public void step(){
        
        
    }
}
