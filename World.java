/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

import java.io.IOException;

/**
 *
 * @author ajfr20
 */
public class World {
    WorldReader wr;
    char[][] worldCharArray; 
    Cell[][] gameBoard;
    World() throws IOException{
        wr = new WorldReader();
        worldCharArray = wr.getWorldCharArray();
        createBoard(worldCharArray, wr.getX(), wr.getY());
    }

    private Cell[][] createBoard(char[][] worldCharArray, int x, int y) {
        for(int r = 0; r<x-1;r++){
            for(int c = 0; c<y-1;c++){
                gameBoard[r][c] = new Cell(r, c, worldCharArray[r][c]);
        }
       }
        return gameBoard;
    }
    
}

