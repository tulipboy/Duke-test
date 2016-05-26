package DukeUniversityJava;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tulip on 30/04/2016.
 */
public class ImportFile {

    String path = "C:\\Users\\tulip\\IdeaProjects\\JavaFX\\src\\DukeUniversityJava\\CaeserCipher\\Resources\\";

    public String setPath(String lokatie){
        return path + lokatie;
    }

    public String tijdelijk;
    public static Scanner reader;
    ArrayList<String> lines = new ArrayList<String>();


    public void importFile(String fileLokatie){
        File file = new File(fileLokatie);
        try {
            reader = new Scanner(file);
        } catch (Exception e){
            System.out.println("could not import the file");
        }
     }

        // converting the document to strings to make it more clear to use some methods on them
    public void convertFile(){
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
        for (int i = 0; i < lines.size(); i++){
            System.out.println(lines.get(i));
        }
    }
    }

