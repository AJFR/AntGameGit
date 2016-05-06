/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Turn implements Instruction {

    public Turn(GameObject lr, Ant ant) {
        if(lr.obj.equals("left")){
            ant.turnLeft();
        }
        if(lr.obj.equals("right")){
            ant.turnRight();
        }
    }
}
