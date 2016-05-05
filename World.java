/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author ajfr20
 */
public class World {
    Random rand;
    WorldReader wr;
    Cell[][] gameBoard;
    World() throws IOException{
        wr = new WorldReader();
        char[][] worldChar = wr.getWorldCharArray();
        //System.out.println(Arrays.toString(worldChar));
        gameBoard = new Cell[wr.getX()][wr.getY()];
        createBoard(worldChar, wr.getX(), wr.getY());
    }

    private Cell[][] createBoard(char[][] worldCharArray, int x, int y) {
        //For every coloumn 0 - X
        for(int c = 0; c<x-1;c++){
            //For every row 0 - Y
            for(int r = 0; r<y-1;r++){
                gameBoard[c][r] = new Cell(c, r, worldCharArray[r][c]);
                setNeighbours(gameBoard[c][r]);
                
            }
        }
        return gameBoard;
    }
    
    public Cell[][] getGameBoard(){
        return gameBoard;
    }
    
    public void addAnt(int c, int r, Ant ant){
        ant.changeCell(gameBoard[c][r]);
        gameBoard[c][r].addAnt(ant);
    }
    
    Ant removeAnt(int c, int r){
        //Not sure
        gameBoard[c][r].getAnt().changeCell(null);
        return gameBoard[c][r].removeAnt();
    }
    
    void addMarker(int c, int r, int marker, Ant ant){
        gameBoard[c][r].setMarker(marker, ant.getColour());
    }
    
    void removeMarker(int c, int r, int marker, Ant ant){
        gameBoard[c][r].removeMarker(marker, ant.getColour());
    }
    
    void pickUpFood(int c, int r){
        gameBoard[c][r].decreaseFood();
    }
    
    void dropFood(int c, int r){
        gameBoard[c][r].addfood();
    }
    
    void senseMarker(int c, int r, int marker, Ant ant){
        gameBoard[c][r].senseMarker(ant.getColour(), marker);
    }
    
    void senseAnyMarker(int c, int r , Ant ant){
        gameBoard[c][r].senseAnyMarker(ant.getColour());
    }
    
    void turnLeft(Ant ant){
        ant.turnLeft();
    }
    
    void turnRight(Ant ant){
        ant.turnRight();
    }
    
    Cell getByPos(int c, int r){
        return gameBoard[c][r];
    }
    
    void setNeighbours(Cell cell){
        Cell[] neighbours = new Cell[6];
        //Sets the neighbours by direction i.e. dir = 0 increase coloumn by 1 same row
        //Cell 0,0 only want dir 0,1
        if(cell.getColoumn()==0&&cell.getRow()==0){
            neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
        }
        //Cell 0,Even want dir 0,1,5
        else if(cell.getColoumn()==0&&cell.getRow()%2==0){
            neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[5] = getByPos(cell.getColoumn(), cell.getRow()+1);
        }
        //Cell 0,Odd want dir 0,1,2,4,5
        else if(cell.getColoumn()==0 &&cell.getRow()%2>0){
            neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[4] = getByPos(cell.getColoumn(), cell.getRow()-1);
            neighbours[5] = getByPos(cell.getColoumn(), cell.getRow()+1);
        }
        //Cell 0,r
        else if (cell.getRow()==0){
            neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
        }
        //Cell Max,0 want dir 1,2,3
        else if(cell.getColoumn()==wr.getX()&&cell.getRow()==0){
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
        }
        //Cell Max,Max want 3,4
        else if(cell.getColoumn()==wr.getX()&&cell.getRow()==wr.getY()){
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
            neighbours[4] = getByPos(cell.getColoumn(), cell.getRow()-1);
        }
        //Cell Max,Even want dir 1,2,3,4,5
        else if(cell.getColoumn()==wr.getX()&&cell.getRow()%2==0){
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
            neighbours[4] = getByPos(cell.getColoumn(), cell.getRow()-1);
            neighbours[5] = getByPos(cell.getColoumn(), cell.getRow()+1);
        }
        //Cell Max,Odd want dir 2,3,4
        else if(cell.getColoumn()==wr.getX()&&cell.getRow()%2>0){
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
            neighbours[4] = getByPos(cell.getColoumn(), cell.getRow()-1);
        }
        else{
            neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
            neighbours[1] = getByPos(cell.getColoumn()+1, cell.getRow()+1);
            neighbours[2] = getByPos(cell.getColoumn(), cell.getRow()+1);
            neighbours[3] = getByPos(cell.getColoumn()-1, cell.getRow());
            neighbours[4] = getByPos(cell.getColoumn(), cell.getRow()-1);
            neighbours[5] = getByPos(cell.getColoumn(), cell.getRow()+1);
        }
        //Calls the setNeighbours method in the cell
        cell.setNeighbours(neighbours);
    }
    
    void moveAnt(Ant ant){
        int c = ant.getCell().getNeighbour(ant.getDir()).getColoumn();
        int r = ant.getCell().getNeighbour(ant.getDir()).getRow();
        if(gameBoard[c][r].getRockey()==true){
            throw new IllegalArgumentException("This cell is rocky");
        }
        if(gameBoard[c][r].isAnt()==true){
            throw new IllegalArgumentException("Already an ant here");
        }
        else{
            //Adds the ant in the cell[c][r] and removes the ant from the old cell
            addAnt(c,r,removeAnt(ant.getCell().getColoumn(), ant.getCell().getRow()));
        }
    }
    
    void kill(Ant ant){
    }
}

