/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Drop implements Instruction{
    Ant ant;
    public Drop(Ant ant){
        this.ant = ant;
        drop();
    }
    
    void drop(){
        ant.dropFood();
    }
}
