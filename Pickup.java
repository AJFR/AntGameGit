/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29 Picks up dank herbs lol
 */
public class Pickup {
    Ant ant;
    
    public Pickup(Ant ant) {
        this.ant = ant;
    }
    
    public void pickUp(){
        ant.pickUpFood();
    }
}
