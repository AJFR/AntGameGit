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
        System.out.println(Arrays.toString(worldChar));
        gameBoard = new Cell[wr.getX()][wr.getY()];
        createBoard(worldChar, wr.getX(), wr.getY());
    }

    private Cell[][] createBoard(char[][] worldCharArray, int x, int y) {
        for(int c = 0; c<x-1;c++){
            for(int r = 0; r<y-1;r++){
                gameBoard[c][r] = new Cell(c, r, worldCharArray[r][c]);
                
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
    
    void setUpNeighbours(Cell cell){
        Cell[] neighbours = new Cell[6];
        neighbours[0] = getByPos(cell.getColoumn()+1, cell.getRow());
        cell.setNeighbours(neighbours);
    }
}

