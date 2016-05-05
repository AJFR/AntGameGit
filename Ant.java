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
    int resting = 0;
    boolean hasFood = false;
    
    
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
    
    public Cell getCell(){
        return currentCell;
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
    
    public void changeCell(Cell cell){
        currentCell = cell;
    }
    
    
    public boolean isResting(){
        return resting>0;
    }
    
    public void rest(){
        resting = 14;
    }
    
    public void decreaseRest(){
        resting--;
        if(resting<0){
            resting = 0;
        }
    }
    
    public int getDir(){
        return direction;
    }
    
    public boolean hasFood(){
        return hasFood;
    }
    
    public void pickUpFood(){
        hasFood = true;
    }
    
    public void dropFood(){
        hasFood = false;
    }
}
