/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Move implements Instruction {
    Ant ant;
    World world;
    public Move(Ant ant, World world){
        this.ant = ant;
        this.world = world;
        move();
    }
    
    public void move(){
        world.moveAnt(ant);
    }
}
