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

    public static Scanner reader;
    ArrayList<String> lines = new ArrayList();
    int[] sizeWords = new int[21];


    public void importFile(String fileLokatie){
        File file = new File(fileLokatie);
        try {
            reader = new Scanner(file);
        } catch (Exception e){
            System.out.println("could not import the file");
        }
     }

        // converting the document to an arraylist of strings to make it more clear to use some methods on them
    public void convertFile(){
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
    }
                /*
                 just put wordLength here temp. as I had some errors.
                 now I know the error: I should use a alphabet instead of " "
                 but what alphabet to use and which reading signs to put into it
                 thoughts for tomorrow...
                */

    public void wordLength(){

        for (int i = 0; i < lines.size() ; i++){
            String regel = lines.get(i);
            int aantal = 0;
            for (int j = 0; j < regel.length(); j++){
                if (regel.charAt(j) != ' ') {
                    aantal++;
                } else if (regel.charAt(j) == ' ') {
                    sizeWords[aantal] = sizeWords[aantal]+1;
                    aantal = 0;
                }
            }

        }
        System.out.println(Arrays.toString(sizeWords));
    }
    }

