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
public class Cell {
    public final int row_no;
    public final int col_no;
    public boolean rocky;
    public boolean anthill;
    public int food_particles;
    public Ant ant;
    
    public Cell(int row_no, int col_no, boolean rocky, boolean anthill, int food, Ant ant) throws IllegalArgumentException{
        //Ensures row number and col number are always greater than zero
        if(row_no<0||col_no<0){
           throw new IllegalArgumentException("Row number and Coloumn number must be greater than zero");
        }
        else{
        this.row_no = row_no;
        this.col_no = col_no;
        }
        
        food_particles = food;
        this.anthill = anthill;
        this.rocky = rocky;
        if(this.rocky){
            throw new IllegalArgumentException("Cannot place ant here cell is rocky");
        }
        this.ant = ant;
    }
    
    public Cell(int row_no, int col_no, boolean rocky, boolean anthill, int food) throws IllegalArgumentException{
        if(row_no<0||col_no<0){
           throw new IllegalArgumentException("Row number and Coloumn number must be greater than zero");
        }
        else{
        this.row_no = row_no;
        this.col_no = col_no;
        }
        
        food_particles = food;
        this.anthill = anthill;
        this.rocky = rocky;
    }
    public Ant removeAnt(){
        if(ant == null){
            throw new IllegalArgumentException("There is no ant in this cell");
        }
        else{
        Ant temp_ant = ant;
        ant = null;
        return temp_ant;
        }
    }
    
    public void addAnt(Ant ant){
        this.ant = ant;
    }
    
}
