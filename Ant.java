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
        // 0 black 1 red
        this.colour = colour;
        isAlive = true;
       currentCell = cell;
       this.direction = direction;
       
    }
    
    public int getColour(){
        return colour;
    }
    
    public void changeDirection(int dir){
        direction = dir;
    }
    
    public void turnLeft(){
        direction--;
        if(direction<0){
            direction = 5;
        }
    }
    
    public void turnRight(){
       direction++;
       if(direction>5){
           direction = 0;
       }
       
    }
}
