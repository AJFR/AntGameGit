/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ajfr20
 */
public class World {
    Random rand;
    WorldReader wr;
    Cell[][] gameBoard;
    World() {
        try {
            wr = new WorldReader();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
        }
        char[][] worldChar = wr.getWorldCharArray();
        System.out.println(Arrays.toString(worldChar));
        gameBoard = new Cell[wr.getX()][wr.getY()];
        createBoard(worldChar, wr.getX(), wr.getY());
    }

    private Cell[][] createBoard(char[][] worldCharArray, int x, int y) {
        for(int r = 0; r<x-1;r++){
            for(int c = 0; c<y-1;c++){
                gameBoard[r][c] = new Cell(r, c, worldCharArray[r][c]);
            }
        }
        return gameBoard;
    }
    
    public Cell[][] getGameBoard(){
        return gameBoard;
    }
    
    public void addAnt(int r, int c, Ant ant){
        gameBoard[r][c].addAnt(ant);
    }
    
    Ant removeAnt(int r, int c){
        return gameBoard[r][c].removeAnt();
    }
    
    void addMarker(int r, int c, int marker, Ant ant){
        gameBoard[r][c].setMarker(marker, ant.getColour());
    }
    
    void removeMarker(int r, int c, int marker, Ant ant){
        gameBoard[r][c].removeMarker(marker, ant.getColour());
    }
    
    void pickUpFood(int r, int c){
        gameBoard[r][c].decreaseFood();
    }
    
    void dropFood(int r, int c){
        gameBoard[r][c].addfood();
    }
}
