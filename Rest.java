/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

/**
 *
 * @author mfm29
 */
public class Rest {
    Ant ant;
    
    public Rest(Ant ant) {
        this.ant = ant;
        rest();
    }

    private void rest() {
        ant.rest();
    }
}
