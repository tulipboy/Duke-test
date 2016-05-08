package DukeUniversityJava;

import java.io.*;
import java.util.Arrays;

/**
 * Created by tulip on 25/04/2016.
 */
public class WordLengths {



    public static void main(String[] args) {
        int[] getallen = new int[20];
        String stringVanDis = "22 22 22 22 333 333 333 333 333 4444 4444 4444 4444 55555 55555 ";
        int aantal = 0;


        for (int i = 0; i < stringVanDis.length() ; i++){
            if (stringVanDis.charAt(i) != ' ') {
                aantal++;
            } else if (stringVanDis.charAt(i) == ' ') {
                getallen[aantal] = getallen[aantal]+1;
                aantal = 0;
            }
        }
        System.out.println(Arrays.toString(getallen));
    }

}