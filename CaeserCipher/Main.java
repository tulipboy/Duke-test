package DukeUniversityJava.CaeserCipher;

import DukeUniversityJava.CaeserCipher.CaeserCipherZelf;

/**
 * Created by tulip on 20/04/2016.
 */
public class Main {


    public static void main(String[] args) {

        // testing the CeaserCipher encryption and decryption with known keys
        CaeserCipherZelf test = new CaeserCipherZelf();
        test.cipher("Dit is EEn probeersel", 12);
        System.out.println("Nu komt er een test om het om te draaien"); //like the tekst says: reverse the encryption test
        test.cipher(CaeserCipherZelf.controle, (26-12) );
        test.encryptTwoKeys("Dit is EEn probeersel", 8, 12);


    }
}
