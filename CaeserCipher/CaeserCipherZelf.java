package DukeUniversityJava.CaeserCipher;

/**
 * Created by tulip on 21/04/2016.
 */
public class CaeserCipherZelf {
    public static String controle;

    public void cipher(String test, int key){
        //create the StringBuilder, Alphabet & Aphabet with key settings
        StringBuilder encrypted = new StringBuilder(test);
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alfabet.substring(key)+ alfabet.substring(0,key);

        // create the loop to create the encryption
        for(int i = 0; i < test.length(); i++) {
            char currChar = test.charAt(i);
            Boolean hoofdletter = false;

            //check if the currChar is a capital letter, if yes make true
            if (Character.isUpperCase(currChar)){
              currChar =  Character.toLowerCase(currChar);
                hoofdletter = true;
            }

            int idx = alfabet.indexOf(currChar);

            //Switch the
            if (idx != -1){
                    char newChar = shiftedAlphabet.charAt(idx);
                while (hoofdletter){
                   newChar = Character.toUpperCase(newChar);
                    hoofdletter = false;
                }
                    encrypted.setCharAt(i, newChar);
            }

        }
        controle = encrypted.toString();
        System.out.print(encrypted.toString());

        // in case encryptTwoKeys is used the if statement is to prevent for typing single characters
        if (encrypted.toString().length()>1){
            System.out.println("");
        }
    }

    public void encryptTwoKeys (String test, int key1, int key2){
        /*
        rolling through the cipher method to solve the encryption
        I thought it was better using the code compared to copying it and altering it
        */
        for (int i = 0; i < test.length(); i++){
        char currChar = test.charAt(i);
        String letter = Character.toString(currChar);
        if (i%2 == 0){
            cipher(letter, key1);
        }
        else
            cipher(letter, key2);
    }

    }


}
