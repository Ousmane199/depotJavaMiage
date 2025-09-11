package partieInitiation2.Jours2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jours2_2 {
    
    private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;
    private String attributPointMoi(String chaine) {
        if(chaine.length()>=3) {
            char adversaire = chaine.charAt(0);
            char moi = chaine.charAt(2); 
            if(adversaire=='A' && moi=='X') return "Defaite3"; //Rock ciseau
            else if(adversaire=='A' && moi=='Y') return "Match Nul1";// Rock rock
            else if(adversaire=='A' && moi=='Z') return "Victoire2";// Rock papier
            
            else if(adversaire=='B' && moi=='X') return "Defaite1"; //papier rock
            else if(adversaire=='B' && moi=='Y') return "Match Nul2"; //papier papier
            else if(adversaire=='B' && moi=='Z') return "Victoire3"; //papier ciseau
            
            else if(adversaire=='C' && moi=='X') return "Defaite2"; //ciseau papier
            else if(adversaire=='C' && moi=='Y') return "Match Nul3"; //ciseau ciseau
            else if(adversaire=='C' && moi=='Z') return "Victoire1"; //ciseau rock
            
            else return "ERREUR"; 
        }
        else return "ERREUR";
    }

    private int point(String chaine) {
        if(attributPointMoi(chaine).equals("Victoire1")) return 6+1;
        else if(attributPointMoi(chaine).equals("Victoire2")) return 6+2;
        else if(attributPointMoi(chaine).equals("Victoire3")) return 6+3;
        else if(attributPointMoi(chaine).equals("Defaite1")) return 0+1;
        else if(attributPointMoi(chaine).equals("Defaite2")) return 0+2;
        else if(attributPointMoi(chaine).equals("Defaite3")) return 0+3;
        else if(attributPointMoi(chaine).equals("Match Nul1")) return 3+1;
        else if(attributPointMoi(chaine).equals("Match Nul2")) return 3+2;
        else if(attributPointMoi(chaine).equals("Match Nul3")) return 3+3;
        else return 0;
    }

    public void day01() {
        String fichier = "day2.txt";
        int ensemblePoint=0;
        int compteurLignes=0;
        try (Scanner scanner = new Scanner(new FileInputStream(PATH_DATA + fichier))) {
             while (scanner.hasNextLine()) {
                 String ch = scanner.nextLine().trim();
                if(!ch.isEmpty()) {
                    int pts = point(ch);
                    ensemblePoint += pts;
                    compteurLignes++;
                    if(compteurLignes <= 5) {
                        System.out.println("Ligne " + compteurLignes + ": '" + ch + "' -> " + pts + " points");
                    }
                }
            }
            System.out.println("Total lignes traitées: " + compteurLignes);
            System.out.println("Le nombre de point est : "+ensemblePoint);
        }
        catch (FileNotFoundException fne) {
            System.err.println(fichier + " est absent ! ");
         }
    }
}