/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Flip implements Instruction{
    Random rand;
    public Flip(int seed){
        rand = new Random(seed);
    }
    
    public int randomInt(int n){
        return rand.randomInt(n);
    }
}
