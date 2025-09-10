package partieInitiation2.Jours1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Jours1_2 {
        private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;
        private final List<Integer> tab= new ArrayList<>();
        
        private int conversionTabCharEntier(String chaine) {
            if(estNombre(chaine.charAt(0))) return Integer.parseInt(chaine);
            return 0;
        }
        public void affichageTab(){
            for(int i=0;i<this.tab.size();i++)
            {
                System.out.println(tab.get(i));
            }
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

    public int troiMax() {
    if (tab.size() < 3) {
        System.err.println("Pas assez d'éléments dans la liste !");
        return 0;
    }
    
    int max1 = Integer.MIN_VALUE; 
    int max2 = Integer.MIN_VALUE;
    int max3 = Integer.MIN_VALUE; 
    
    for (int valeur : tab) {
        if (valeur > max1) {
            max3 = max2;
            max2 = max1;
            max1 = valeur;
        } else if (valeur > max2) {
            max3 = max2;
            max2 = valeur;
        } else if (valeur > max3) {
            max3 = valeur;
        }
    }
    
    return max1+max2+max3;
}
 

    public void day00() {
        String fichier = "day00.txt";
        int tmp=0;
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) { // On essaye d'ouvrir le fichier

            while (scanner.hasNextLine()) {// On lit le fichier ligne par ligne 
                String ch = scanner.nextLine().trim();
                if(ch.isEmpty()) {
                    tab.add(tmp);
                    tmp=0;
                }
                else tmp+=conversionTabCharEntier(ch);
            }
        }
        catch (FileNotFoundException fne) { // On affiche une erreur si le fichier n'a pas pu etre trouve
            System.err.println(fichier + " est absent ! "); 
        }
    }
}