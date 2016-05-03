/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mfm29
 */
class AntBrainGenerator {

    ArrayList states;
    ArrayList instructions;

    public AntBrainGenerator() {
        instructions = new ArrayList<String>();

        constructBrain();
    }
    
    /**
     * Uses a FileWriter object to write the contents of an ArrayList, 
     * containing the brains states to a text file, where each instruction is 
     * separated by a new line.
     */
    private void constructBrain() {

        File brainFSA = new File("antBrainFSA");
        try {
            FileWriter brainWriter = new FileWriter(brainFSA);
            instructions = fsaContents();

            int i = 0;
            int y = 0;
            while (i < instructions.size()) {
                brainWriter.write((String) instructions.get(i));
                brainWriter.write(System.getProperty("line.separator"));
                i++;
            }

            brainWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(AntBrainGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * 
     * @return A String ArrayList containing the contents of the brain, where 
     * each instruction is indexed by it's state in an FSA model.
     */
    private ArrayList<String> fsaContents() {

        String contents = new String("");
        addInstruction("Flip 10 1 2"); // state 0
        addInstruction("Flip 10 5 6"); //state 1
        addInstruction("Flip 10 3 4"); //state 2
        addInstruction("Flip 10 11 12"); //state 3
        addInstruction("Flip 10 13 14"); //state 4
        addInstruction("Flip 10 7 8"); //state 5
        addInstruction("Flip 10 9 10"); //state 6
        addInstruction("Flip 10 15 16"); //state 7
        addInstruction("Flip 10 17 18"); //state 8
        addInstruction("Flip 10 19 20"); //state 9
        addInstruction("Flip 10 21 22"); //state 10
        addInstruction("Flip 10 23 24"); //state 11
        addInstruction("Flip 10 25 26"); //state 12
        addInstruction("Flip 10 27 28"); //state 13
        addInstruction("Flip 10 29 30"); //state 14

        addInstruction("Sense Ahead 31 0 Food"); //state 15 
        addInstruction("Sense Ahead 44 0 Rock"); //state 16 
        addInstruction("Sense Left 48 5 Food"); //state 17 
        addInstruction("Sense Ahead 51 0 FoeHome"); //state 18 
        addInstruction("Sense Right 51 0 FriendWithFood"); //state 19 
        addInstruction("Sense Left 51 3 Friend"); //state 20 
        addInstruction("Sense Right 54 13 Home"); //state 21 
        addInstruction("Sense Left 62 13 FoeWithFood"); //state 22 
        addInstruction("Sense Right 62 7 Foe"); //state 23 
        addInstruction("Sense Left 54 0 Home"); //state 24 
        addInstruction("Sense Left 65 9 Rock"); //state 25 
        addInstruction("Sense Left 0 0 FoeHome"); //state 26 
        addInstruction("Sense Ahead 67 0 FoeWithFood"); //state 27 
        addInstruction("Sense Right 69 27 FoeWithFood"); //state 28 
        addInstruction("Sense Ahead 70 0 FriendWithFood"); //state 29 
        addInstruction("Sense Right 72 12 Food"); //state 30 

        addInstruction("Move 32 33"); //state 31
        addInstruction("Pickup 36 32"); //state 32
        addInstruction("Flip 10 34 35"); //state 33
        addInstruction("Turn Left 0"); //state 34
        addInstruction("Turn Right 0"); //state 35

        addInstruction("Sense Ahead 37 39 Home"); //state 36
        addInstruction("Move 38 0"); //state 37
        addInstruction("Drop 0"); //state 38
        addInstruction("Flip 10 40 41"); //state 39
        addInstruction("Turn Left 36"); //state 40
        addInstruction("Flip 10 42 43"); //state 41
        addInstruction("Turn Right 39"); //state 42
        addInstruction("Move 0 36"); //state 43

        addInstruction("Flip 10 45 46"); //state 44
        addInstruction("Turn Right 47"); //state 45
        addInstruction("Turn Left 47"); //state 46
        addInstruction("Move 0 44"); //state 47

        addInstruction("Turn Left 49"); //state 48
        addInstruction("Move 50 0"); //state 49
        addInstruction("Pickup 36 0"); //state 50

        addInstruction("Flip 10 52 53"); //state 51
        addInstruction("Turn Right 0"); //state 52
        addInstruction("Turn Left 0"); //state 53

        addInstruction("Sense Ahead 55 57 FoeHome"); //state 54
        addInstruction("Move 56 0"); //state 55
        addInstruction("Drop 0"); //state 56
        addInstruction("Flip 10 58 59"); //state 57
        addInstruction("Turn Left 54"); //state 58
        addInstruction("Flip 10 60 61"); //state 59
        addInstruction("Turn Right 54"); //state 60
        addInstruction("Move 0 54"); //state 61

        addInstruction("Move 63 0"); //state 62
        addInstruction("TurnLeft 64"); //state 63
        addInstruction("Move 0 54"); //state 64

        addInstruction("Move 66 0"); //state 65
        addInstruction("Sense Left 65 0 Rock"); //state 66

        addInstruction("Sense Ahead 0 68 Foe"); //state 67
        addInstruction("Move 67 0"); //state 68

        addInstruction("Turn Right 67"); //state 69

        addInstruction("Sense Ahead 0 71 FriendWithFood"); //state 70
        addInstruction("Move 0 70"); //state 71

        addInstruction("Turn Right 73"); //state 72
        addInstruction("Move 74 0"); //state 73
        addInstruction("Pickup 36 0"); //state 74

        return instructions;
    }

    /**
     *
     * @param line Brain instruction to be added to the instructions list
     */
    private void addInstruction(String line) {
        instructions.add(line);
    }

}
