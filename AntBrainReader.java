/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assembledantgame;

import java.awt.List;
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
    private ArrayList<ArrayList<Instruction>> instructionsList;
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
    public AntBrainReader() {
        FSA = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("AntBrainFSA..txt")); //Replace with File name if you can get the browser working

            int line = 0;
            while (sc.hasNextLine()) {

                String command = sc.nextLine();
                FSA.add(command);
                line++;
            }

            instructionsList = new ArrayList<ArrayList<Instruction>>();

            for (int i = 0; i < FSA.size(); i++) {
                instructionsList.add(split(FSA.get(i)));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<String> getFSA() {
        return FSA;
    }

    private ArrayList<Instruction> split(String instructionString) {
        ArrayList<Instruction> StringConversion = new ArrayList<Instruction>();
        instructionString = instructionString.trim().toLowerCase();
        for (int i = 0; i < instructionString.length(); i++) {
            if (instructionString  {
            }
      
        }

        return StringConversion;
    }
}
