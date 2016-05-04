/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mfm29
 */
public class AntBrainReader {

    private ArrayList<String> FSA;
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author ajfr20
     */
    /**
     * @param args the command line arguments
     */
    public AntBrainReader()  {
        FSA = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("AntBrainFSA..txt")); //Replace with File name if you can get the browser working

            int i = 0;
            while (sc.hasNextLine()) {
                //String[] command = sc.nextLine().split(" ");
                //for(String s: command){
                //System.out.println(s);
                String command = sc.nextLine();
                FSA.add(command);
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> getFSA() {
        return FSA;
    }
}
