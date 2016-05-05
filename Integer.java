/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Integer implements Instruction {

    private int x;

    public Integer(int x) {
        this.x = x;
    }
    public int getValue(){
        return x;
    }
}
