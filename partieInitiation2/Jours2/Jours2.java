package partieInitiation2.Jours2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jours2 {
    
    private final String PATH_DATA = "partieInitiation2" + File.separator + "src" + File.separator + "data" + File.separator;

    private int typeDejeu(char chaine) {
        if(chaine=='A' || chaine=='X') return 1;
        else if(chaine=='B' || chaine=='Y') return 2;
        else if(chaine=='C' || chaine=='Z') return 3;
        else return 0;
    }
    
    private String attributPointMoi(String chaine) {
        if(chaine.length()>=3) {
            int adversaire = typeDejeu(chaine.charAt(0));
            int moi = typeDejeu(chaine.charAt(2));
                                                   
            if(moi==adversaire && moi==1) return "Match Nul1";
            else if(moi==adversaire && moi==2) return "Match Nul2";
            else if(moi==adversaire && moi==3) return "Match Nul3";
            else if(adversaire==1 && moi==2) return "Victoire2"; //rock paper
            else if(adversaire==2 && moi==3) return "Victoire3"; //paper scissors
            else if(adversaire==3 && moi==1) return "Victoire1"; //scissors rock
            else if(adversaire==2 && moi==1) return "Defaite1"; //paper rock
            else if(adversaire==3 && moi==2) return "Defaite2"; //scissors paper
            else if(adversaire==1 && moi==3) return "Defaite3"; //rock scissors
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
        String fichier = "day01.txt";
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