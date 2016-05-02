/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

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
    
    
    public Ant(int i, int colour, Cell cell, int direction){
        id = i;
        this.colour = colour;
        isAlive = true;
       currentCell = cell;
       this.direction = direction;
       
    }
}
