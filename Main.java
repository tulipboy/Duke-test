package DukeUniversityJava;

/**
 * Created by tulip on 30/04/2016.
 */
public class Main {


    public static void main(String[] args) {
        ImportFile file = new ImportFile();
        file.importFile(file.path +  "smallHamlet.txt");
        file.convertFile();
        file.wordLength();

    }

}
