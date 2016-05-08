package DukeUniversityJava;

import java.io.*;
import java.util.Arrays;

/**
 * Created by tulip on 30/04/2016.
 */
public class ImportFile {

    String path = "C:\\Users\\tulip\\IdeaProjects\\JavaFX\\src\\DukeUniversityJava\\CaeserCipher\\Resources\\";

    public String setPath(String lokatie){
        return path + lokatie;
    }
    public String tijdelijk;





    public void importFile(String fileLokatie){
        File file = new File(fileLokatie);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        int[] getallen = new int[20];

        try {
            fis = new FileInputStream(file);

            // Here BufferedInputStream is added for fast reading.
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            // dis.available() returns 0 if the file does not have more lines.
            while (dis.available() != 0) {

                String stringVanDis = dis.toString();
                int aantal = 0;

                System.out.println(stringVanDis);
                for (int i = 0; i < stringVanDis.length() ; i++){
                    if (stringVanDis.charAt(i) != ' ') {
                        aantal++;
                    } else if (stringVanDis.charAt(i) == ' ') {
                        getallen[aantal] = getallen[aantal]+1;
                        aantal = 0;
                    }
                }
                // this statement reads the line from the file and print it to
                // the console.
                System.out.println(dis.readLine());
            }

            // dispose all the resources after using them.
            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(getallen));

    }
    }

