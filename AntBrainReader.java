/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ant.brain.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ajfr20
 */
public class AntBrainReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("brain.txt"));
        while (sc.hasNextLine()) {
            //String[] command = sc.nextLine().split(" ");
            //for(String s: command){
            //System.out.println(s);
            String command = sc.nextLine();
            System.out.println(command);
            }
      }  
    }
   
