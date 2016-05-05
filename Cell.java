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
  private final int coloumn_no;
  private final int row_no;
  private boolean rocky = false;
  private int food_particles = 0;
  //Might replace with an int for anthill
  private boolean[] anthill;
  private Ant ant;
  //There can be up to 6 different types of marker for each colour in a cell
  public int cellMarkers[][] = new int[2][6];
  Cell[] adj_cells;
    
    public Cell(int coloumn_no, int row_no, char cellType){
        //Assigns row and coloumn number as usual
        if(row_no < 0 || coloumn_no < 0){
            throw new IllegalArgumentException("Coloumn and Row numbers must be greater than zero");
        }
        else{
            this.row_no = row_no;
            this.coloumn_no = coloumn_no;
        }
        //Turns the character into an int
        int cellFood = Character.getNumericValue(cellType);
        //If the int is greater than 0 and less than or equal to 9 then its a food cell  
        if(cellFood>0&&cellFood<=9){
            food_particles = cellFood;
        }
        else{
            //Checks the char 
            switch(cellType){
                //When the char is a # its a rocky cell
                case '#':
                    rocky = true;
                    break;
                //When char is a + red anthill    
                case '+':
                    anthill[1] = true;
                //When char - black anthill
                case '-':
                    anthill[0] = true;
                default:
                    throw new IllegalArgumentException("Illegal character");
                
            }
        }
        //Initalises all markers to be 0
        int cellMarkers[][] = {{0,0,0,0,0,0} ,{0,0,0,0,0,0}};
    }
    //Old constructer - Testing
    public Cell(int coloumn_no, int row_no, boolean rocky, boolean anthill, int food){
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
        //Change if neccessary
        //this.anthill = anthill;
    }
    //Gets row number
    public int getRow(){
        return row_no;
    }
    //Gets coloumn number
    public int getColoumn(){
        return coloumn_no;
    }
    //Gets a boolean cell is rockey true else false
    public boolean getRockey(){
        return rocky;
    }
    //Returns the amount of food in a cell
    public int getFood(){
        return food_particles;
    }
    //Sets the number of food particles in a cell
    public void setFood(int food){
        food_particles = food;
    }
    //Increases the amount of food by 1
    public void addfood(){
        food_particles++;
    }
    //Decreases the amount of food by 1
    public void decreaseFood(){
        if(food_particles==0){
            throw new IllegalArgumentException("No food to remove");
        }
        else{
            food_particles--;
        }
    }
    //Gets whether the cell is an anthill by colour
    public boolean getAnthill(int colour){
        return anthill[colour];
    }
    //Adds an ant to the cell
    public void addAnt(Ant ant){
        //If ant is null do nothing
        if(ant!=null){
            throw new IllegalArgumentException("There is already an Ant in this cell");
        }
        //Otherwise add the ant to the cell
        else{
            this.ant = ant;
        }
        
    }
    //Returns whether an ant is in the cell
    public boolean isAnt(){
        return !(ant == null); 
    }
    //Removes the ant from the cell
    public Ant removeAnt(){
       Ant temp_ant = ant;
       ant = null;
       return temp_ant;
    }
    //Returns the cells neighbours
    public Cell[] getNeighbours(){
        return adj_cells;
    }
    //Gets a specific neighbour depending of the direction
    public Cell getNeighbour(int dir){
        return adj_cells[dir];
    }
    //Adds the neighbours to Cell[] adj_cells
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
    //Returns the ant in the cell if there is one
    public Ant getAnt(){
        return ant;
    }
}
