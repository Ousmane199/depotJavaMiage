package partieInitiation2.Jours2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jours2_3 {
    
    private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;

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
    
    private int calculerDimension(String chaine)
    {
        int p=chaine.indexOf("x");
        //System.out.println(p + " " + chaine);
        int longueur = Integer.parseInt(chaine.substring(0,p));
        chaine=chaine.substring(p+1);
        p=chaine.indexOf("x");
        int largeur = Integer.parseInt(chaine.substring(0,p));
        chaine=chaine.substring(p+1);
        int hauteur = Integer.parseInt(chaine);
        int cote1=longueur*largeur;
        int cote2=largeur*hauteur;
        int cote3=hauteur*longueur;
        int min=0;
        if(cote1<cote2) min=cote1;
        else min=cote2;
        if(min>cote3) min=cote3;
        return 2*cote1+2*cote2+2*cote3 + min;
    }

    public void day01() {
        String fichier = "day2_3.txt";
        int nombreTotal=0;
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) {
             while (scanner.hasNextLine()) 
             {
                String ch = scanner.nextLine().trim();
                if(estNombre(ch.charAt(0)))nombreTotal += calculerDimension(ch);
             }
        }
        catch (FileNotFoundException fne) {
            System.err.println(fichier + " est absent ! ");
         }
        System.out.println("Le nombre de point est : "+nombreTotal);
    }
}