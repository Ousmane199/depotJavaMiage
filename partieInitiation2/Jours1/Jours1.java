package partieInitiation2.Jours1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Jours1 {
        private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;

        
        private int conversionTabCharEntier(String chaine) {
            if(estNombre(chaine.charAt(0))) return Integer.parseInt(chaine);
            return 0;
        }
        private boolean estNombre(char chaine) 
        {
           if(chaine=='0') return true;
           else if(chaine=='1') return true;
           else if(chaine=='2') return true;
           else if(chaine=='3') return true;
           else if(chaine=='4') return true;
           else if(chaine=='5') return true;
           else if(chaine=='6') return true;
           else if(chaine=='7') return true;
           else if(chaine=='8') return true;
           else if(chaine=='9') return true;
           else return false;
        }
 

    public void day00() {
        String fichier = "day1.txt";
        int tmp=0;
        int max=0;
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) { // On essaye d'ouvrir le fichier

            while (scanner.hasNextLine()) {// On lit le fichier ligne par ligne 
                String ch = scanner.nextLine().trim();
                if(ch.isEmpty()) { // if(ch=="")
                    if(tmp>max) max=tmp;
                    tmp=0;
                }
                else tmp+=conversionTabCharEntier(ch);
            }
        }
        catch (FileNotFoundException fne) { // On affiche une erreur si le fichier n'a pas pu etre trouve
            System.err.println(fichier + " est absent ! "); 
        }
        System.out.println("Le maximum est : "+max);
    }
}