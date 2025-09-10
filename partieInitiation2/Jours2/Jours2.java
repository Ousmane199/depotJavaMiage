package partieInitiation2.Jours2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Jours2 {
        private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;

    public void day00() {
        String fichier = "day01.txt";
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) { // On essaye d'ouvrir le fichier

            while (scanner.hasNextLine()) {// On lit le fichier ligne par ligne 
                String ch = scanner.nextLine().trim();
                System.out.println(ch);
            }
        }
        catch (FileNotFoundException fne) { // On affiche une erreur si le fichier n'a pas pu etre trouve
            System.err.println(fichier + " est absent ! "); 
        }
    }
}