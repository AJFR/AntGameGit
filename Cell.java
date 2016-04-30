/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

/**
 *
 * @author freakin
 */
public class Cell {
  public final int row_no;
  public final int coloumn_no;
  public boolean rocky;
  public int food_particles;
  public boolean anthill;
  public Ant ant;
  //There can be up to 6 different types of marker for each colour in a cell
  public int cellMarkers[][] = new int[2][6];
  Cell[] adj_cells;
    
    public Cell(int row_no, int coloumn_no, boolean rocky, boolean anthill, int food){
        if(row_no < 0 || coloumn_no < 0){
            throw new IllegalArgumentException("Coloumn and Row numbers must be greater than zero");
        }
        else{
            this.row_no = row_no;
            this.coloumn_no = coloumn_no;
        }
        //Each marker is initilised as 0 as this means that that marker is not present in the cell
        int cellMarkers[][] = {{0,0,0,0,0,0} ,{0,0,0,0,0,0}};
        this.rocky = rocky;
        food_particles = food;
        this.anthill = anthill;
    }
    
    public int getRow(){
        return row_no;
    }
    
    public int getColoumn(){
        return coloumn_no;
    }
    
    public boolean getRockey(){
        return rocky;
    }
    
    public int getFood(){
        return food_particles;
    }
    
    public void setFood(int food){
        food_particles = food;
    }
    
    public void addfood(){
        food_particles++;
    }
    
    public void decreaseFood(){
        if(food_particles==0){
            throw new IllegalArgumentException("No food to remove");
        }
        else{
            food_particles--;
        }
    }
    
    public boolean getAnthill(){
        return anthill;
    }
    
    public void addAnt(Ant ant){
        if(ant!=null){
            throw new IllegalArgumentException("There is already an Ant in this cell");
        }
        else{
            this.ant = ant;
        }
        
    }
    
    public boolean isAnt(){
        return !(ant == null); 
    }
    
    public Ant removeAnt(){
       Ant temp_ant = ant;
       ant = null;
       return temp_ant;
    }
    
    public Cell[] getNeighbours(){
        return adj_cells;
    }
    
    public Cell getNeighbour(int dir){
        return adj_cells[dir];
    }
    
    public void setNeighbours(Cell[] neighbours){
        adj_cells = neighbours;
    }
    
    public void setMarker(int colour, int marker){
        //
        if(cellMarkers[colour][marker]==0){
            cellMarkers[colour][marker] = 1;
        }
        else{
            throw new IllegalArgumentException("There's already a marker of that type and colour here");
        }
    }
    
    public void removeMarker(int colour, int marker){
        cellMarkers[colour][marker]=0;
    }
    
    public boolean senseMarker(int colour, int marker){
        //If a the int for a particular marker is == to 1 returns true else false
      return cellMarkers[colour][marker]==1;
    }
    
    public boolean senseAnyMarker(int colour){
        //Flip flops colour so that you get the opposite colour(Black = 0 Red = 1 therefore colour = 1 - 0 for red and colour = 1 - 1)
        colour = 1 - colour;
        boolean anyEnemyMarkerHere = false;
        int markerCnt = 0;
        //Whilst no enemy marker has been found and all the marker types havn't been looked at keep looping
        while(anyEnemyMarkerHere==false && markerCnt<5){
            //If a cell marker is equal to 1 then there is a marker of that type here
            if(cellMarkers[colour][markerCnt]==1){
                //Sets the variable to true and exits the loop
                anyEnemyMarkerHere = true;
            }
            markerCnt++;
        }
        return anyEnemyMarkerHere;
    }
}
