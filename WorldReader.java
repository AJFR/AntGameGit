/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antgame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static java.util.regex.Pattern.compile;



/**
 *
 * @author freakin
 */
public class WorldReader {
    Pattern worldValidation;
    Matcher worldMatcher;
    BufferedReader worldReader;
    char[] worldCharArray;
    String worldString;
    int sizeX;
    int sizeY;
    
    
    WorldReader() throws FileNotFoundException, IOException{
        //Tries to load the file currantly tiny.world
        try(BufferedReader worldReader = new BufferedReader(new FileReader("1.world"))) {
            //Creates a stringbuilder to create the string of the world
            StringBuilder worldBuild = new StringBuilder();
            //The top two lines of the file are always the x and y size of the world
            sizeX = Integer.parseInt(worldReader.readLine());
            sizeY = Integer.parseInt(worldReader.readLine());
            String lineRead = worldReader.readLine();
            //Whilst the reader still has lines
            while (lineRead != null) {
                //Adds the lines to the stringbuilder putting a line seperator between each line
                worldBuild.append(lineRead);
                worldBuild.append("\n");
                lineRead = worldReader.readLine();
            }
            worldString = worldBuild.toString();
            
            worldValidation = Pattern.compile("(#\\s)*#\\s\\n((\\s#|#)(\\s[0-9+.#-])*(\\s#|#)\\s\\n)*(\\s#|#)(\\s#)+");
            worldMatcher = worldValidation.matcher(worldString);
            
            System.out.println(worldValidation.pattern());
            if(worldMatcher.find()){
                System.out.println("World Matches!");
                System.out.println(worldString);
                String noSpaces = worldString.replaceAll("\\s", "");
                worldCharArray = noSpaces.toCharArray();
               // System.out.println(Arrays.toString(worldCharArray));
            }
    
        }
    }
}