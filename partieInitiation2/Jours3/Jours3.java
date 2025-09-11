package partieInitiation2.Jours3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jours3 {
    
    private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;
    private int verification(char chaine) {
        if(chaine=='(') return 1;
        else if(chaine==')') return -1;
        else return 0;
    }
    private int compteEtage(String chaine)
    {
        int etage=0;
        for(int i=0;i<chaine.length();i++) etage+=verification(chaine.charAt(i));
        return etage;
    }
    public void day01() {
        String fichier = "day3.txt";
        int resultat=0;
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) {
             while (scanner.hasNextLine()) 
             {
                String ch = scanner.nextLine().trim();
                resultat+=compteEtage(ch);
             }
        }
        catch (FileNotFoundException fne) {
            System.err.println(fichier + " est absent ! ");
         }
        System.out.println("Le resultat est : "+resultat);
    }
}