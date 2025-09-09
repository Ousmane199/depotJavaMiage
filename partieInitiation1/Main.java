import java.util.Random;
import java.util.Scanner;

public class Main {
    //2
    public static int age0()
    {
        System.out.println("Veuillez saisir votre date de naissance");
        Scanner sc=new Scanner(System.in);
        return  sc.nextInt();
    }
    public static int age1()
    {
        System.out.println("Veuillez saisir votre date de naissance");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        return age;
    }

    //Exo 3
    public static int saisieEntier()
    {
        System.out.println("Veuillez saisir un entier");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static double saisieDouble()
    {
        System.out.println("Veuillez saisir un entier");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    static void verifierSaisie3(){
        int saisie = saisieEntier();
        if(saisie>10){System.out.println("Oui");}
        if(saisie<10){System.out.println("Non");}
    }
    //4

    static void verifierSaisie4(){
        int saisie = saisieEntier();
        if(saisie>10){System.out.println("Oui");}
        else {System.out.println("Non");}
    }
    
    //5 

    static void verifierSaisie5(){
        int i = saisieEntier();
        int j = saisieEntier();
        if(i>5){System.out.println("Oui");}
        else if(j>10){System.out.println("Coucou");}
        else {System.out.println("-->  -(: ");}
    }

    //6
    public static double saisieNote(String note)
    {
        System.out.println(note);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    static double moyenne(double a, double b) {return (a+b)/2;}
    static void verifierSaisie6(){
        double francais = saisieNote("Veuillez saisir votre note de français");
        double anglais = saisieNote("Veuillez saisir votre note d'anglais");
        if(francais>10 && anglais>10){System.out.println("Année reussie :-)");}
        else {System.out.println("Annee non reussie :-(");}
    }
    static void verifierSaisie6B(){
        double francais = saisieNote("Veuillez saisir votre note de français");
        double anglais = saisieNote("Veuillez saisir votre note d'anglais");
        if(((francais>=10 && anglais>=8) || (anglais>=10 && francais>=8))&& moyenne(francais, anglais)>10){System.out.println("Année reussie avec compensation :-)");}
        else if(((francais>=10 && anglais>=10))&& moyenne(francais, anglais)>10){System.out.println("Année reussie avec compensation :-)");}
        else {System.out.println("Annee non reussie :-(");}
    }
    static void verifierSaisie6C(){
        double francais = saisieNote("Veuillez saisir votre note de français");
        double anglais = saisieNote("Veuillez saisir votre note d'anglais");
        if((francais<10 && anglais<100) ){System.out.println("Année non reussie, redoublement :-(");}
        else {System.out.println("Annee non reussie :-(");}
    }

    //7 Deja fait

    //8 
    static void verificationSaisie8A()
    {
        int entier=saisieEntier();
        /* switch(entier%2)
        {
            case 0:
                System.out.println("L'entier est pair");
                break;
            case 1:
                System.out.println("L'entier est impair");
                break;
        } */

        if(entier%2==0){System.out.println("L'entier est pair");}
        else {System.out.println("L'entier est impair");}
    }
    static void verificationSaisie8B()
    {
        int entier=saisieEntier();
        /* switch(entier%2)
        {
            case 0:
                System.out.println("L'entier est pair");
                break;
            case 1:
                System.out.println("L'entier est impair");
                break;
        } */
        if(entier%2==0){System.out.println("Est multiple de 2");}
        if(entier%4==0){System.out.println("Est multiple de 4");}
        else if(entier%6==0){System.out.println("Est multiple de 6");}
        else {System.out.println("N'est ni multiple de 4 ni de 6");}
    }

    //9 
    static double  abs(double a) {return (a<0)?a*(-1):a;}

    static void verificationSaisie9A()
    {
        double entier=saisieDouble();
        System.out.println(abs(entier));
    }
    static void verificationSaisie9B()
    {
        double entier=saisieDouble();
        int conversion=(int)abs(entier);
        System.out.println(conversion);
    }

    //11 
    /* 
     * Voir les autres questions deja  realiser
     */

    //12

    static String conversionHeure(int secondes)
    {
        int reste;
        int annee ;
        int jours;
        int heures;
        int minutes;
        int seconde;
        annee = secondes / 31536000;
        if(annee>0){
            reste = secondes % 31536000;// Une année = 31536000 secondes
            jours = reste / 86400;// Un jour = 86400 secondes
            if(jours>0){
                reste = reste % 86400;// On fait la modification du reste
                heures = reste / 3600;// Une heure = 3600 secondes
                if(heures>0){
                    reste = reste % 3600;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
                else{
                    heures = 0;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
            }
            }
            else{
                jours = 0;
                heures = reste / 3600;
                if(heures>0){
                    reste = reste % 3600;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
                else{
                    heures = 0;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
            }
        }
        else{
            annee = 0;
            jours = secondes / 86400;
            if(jours>0){
                reste = secondes % 86400;
                heures = reste / 3600;
                if(heures>0){
                    reste = reste % 3600;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
                else{
                    heures = 0;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
            }
            else{
                jours = 0;
                heures = secondes / 3600;
                if(heures>0){
                    reste = secondes % 3600;
                    minutes = reste / 60;
                    if(minutes>0){
                        reste = reste % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = reste;
                    }
                }
                else{
                    heures = 0;
                    minutes = secondes / 60;
                    if(minutes>0){
                        reste = secondes % 60;
                        seconde = reste;
                    }
                    else{
                        minutes = 0;
                        seconde = secondes;
                    }
                }
            }
        }
        if(annee>0) return annee+" année(s) "+jours+" jour(s) "+heures+" heure(s) "+minutes+" minute(s) "+seconde+" seconde(s)";
        else if(jours>0) return jours+" jour(s) "+heures+" heure(s) "+minutes+" minute(s) "+seconde+" seconde(s)";
        else if(heures>0) return heures+" heure(s) "+minutes+" minute(s) "+seconde+" seconde(s)";
        else if(minutes>0) return minutes+" minute(s) "+seconde+" seconde(s)";
        else return seconde+" seconde(s)";
    }

    //13 
    static void multiple3()
    {
        for(int i=1;i<=1000;i++)
        {
            if(i%3==0){System.out.println("Multiple de 3 : "+i);}
        }
    }
    //14
    static void partieEntiere10()
    {
        int entier=saisieEntier();
        int partieEntiere=entier/10;
        System.out.println(partieEntiere);
    }

    //15
    static int[] tabAlleatoire(int taille)
    {
        Random rand = new Random();
        //int taille=10;
        int[] tab=new int[taille];
        for(int i=0;i<taille;i++)
        {
            tab[i]= rand.nextInt(0, taille); // On remplit le tableau par les valeurs aleatoires comprises entre 0 et taille
        }
        return tab;
    }
    static void rechercheNombre(int n)
    {
        
        int taille= saisieEntier();
        int[] tab=tabAlleatoire(taille);
        boolean trouve=false;
        int i=0;
        int position=0;
        while(i<taille && !trouve)
        {
            if(tab[i]==n)
            {
                trouve=true;
                position=i;
            }
            i++;
        }
        if(trouve){System.out.println("Le nombre "+n+" a été trouvé dans le tableau en position "+(++position)+".");}
        else {System.out.println("Le nombre "+n+" n'a pas été trouvé dans le tableau");}
    }
    //16
    static void sommeElements()
    {
        int nombre=saisieEntier();
        int somme=0;
        for(int i=1;i<=nombre;i++)
        {
            somme+=i;
        }
        System.out.println("La somme des "+nombre+" premiers entiers est "+somme);
    }

    //17

    static int[] triAbull(int[] tab)
    {
        boolean estTrie=false;
        int i=0;
        int temp=0;
        while(!estTrie && i<tab.length)
        {
            estTrie=true;
            int j=0;
            while(j<tab.length-1)
            {
                if(tab[j]>tab[j+1])
                {
                    temp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=temp;
                    estTrie=false;
                }
                j++;
            }
            i++;
        }
        return tab;
        
    }

    static void afficherTab(int[] tab)
    {
        for(int i=0;i<tab.length;i++)
        {
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }
    static void miniMaxTrieEnsemble()
    {
        int i=0;
        int[] tab=new int[5];
        //Saisie des 5 entiers
        while(i<5)
        {
            int nombre=saisieEntier();
            tab[i]=nombre;
            i++;
        }
        //Recherche du min et du max
        int min=tab[0];
        int max=tab[0];
        for(int j=1;j<tab.length;j++)
        {
            if(tab[j]<min){min=tab[j];}
            if(tab[j]>max){max=tab[j];}
        }
        System.out.println("Le minimum est "+min+" et le maximum est "+max);   
        
        //Tri
        tab=triAbull(tab);
        afficherTab(tab);
        
        
    }
    //18
    static int[] triInverse(int[] tab )
    {
        tab=triAbull(tab);
        int[] tabInverse=new int[tab.length];
        for(int i=tab.length-1;i>=0;i--)
        {
            tabInverse[tab.length-1-i]=tab[i];
        }
        return tabInverse;
    }
    static void triInverse()
    {
        int taille=saisieEntier();
        int[] tab=tabAlleatoire(taille);
        afficherTab(tab);
        tab=triAbull(tab);
        afficherTab(tab);
        tab=triInverse(tab);
        afficherTab(tab);
    }

    //19
    static boolean estPremier(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    static void cribleEratosthene(int n)
    {
        for(int i=0;i<=n;i++)
        {
            if(estPremier(i)) System.out.println(i+" ");
        }
    }

    //20
    static String saisieChaine()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaine de caractere");
        return sc.nextLine();
    }

    static void decalages1()
    {
        String chaine = saisieChaine();
        char[] tabChar=chaine.toCharArray();// On convertit la chaine en tableau de caractere
        String nouvelleChaine="";
        for(int i=0;i<tabChar.length;i++)
        {
            char c=tabChar[i];
            int valeurUnicode=(int)c; 
            if(valeurUnicode<91 && valeurUnicode>64) 
            {
                if(valeurUnicode==90)//La lettre Z
                    valeurUnicode=65; 
                else valeurUnicode+=1;
            }
            else if(valeurUnicode<123 && valeurUnicode>96) // Si le caractere est une lettre minuscule
            {
                if(valeurUnicode==122) valeurUnicode=97; 
                else valeurUnicode+=1; 
            }
            //Sion il va garde la meme valeur
            char caractereDecale=(char)valeurUnicode; 
            tabChar[i]=caractereDecale;
        }

        nouvelleChaine=String.valueOf(tabChar);// On convertit le tableau de caractere en chaine
        System.out.println(nouvelleChaine);
        
    }
    static void decalageN(int n)
    {
        String chaine = saisieChaine();
        char[] tabChar=chaine.toCharArray();// On convertit la chaine en tableau de caractere
        String nouvelleChaine="";
        for(int i=0;i<tabChar.length;i++)
        {
            char c=tabChar[i];
            int valeurUnicode=(int)c; 
            if(valeurUnicode<91 && valeurUnicode>64) 
            {
                if(valeurUnicode==90)//La lettre Z
                    valeurUnicode=65; 
                else if(valeurUnicode+n>90) valeurUnicode=65+(n-(90-valeurUnicode)-1);
                else valeurUnicode+=n;
            }
            else if(valeurUnicode<123 && valeurUnicode>96) // Si le caractere est une lettre minuscule
            {
                if(valeurUnicode==122) valeurUnicode=97; 
                else if(valeurUnicode+n>122) valeurUnicode=97+(n-(122-valeurUnicode)-1);
                else valeurUnicode+=n; 
            }
            //Sion il va garde la meme valeur
            char caractereDecale=(char)valeurUnicode; 
            tabChar[i]=caractereDecale;
        }

        nouvelleChaine=String.valueOf(tabChar);// On convertit le tableau de caractere en chaine
        System.out.println(nouvelleChaine);
    }

    //21
    static void codageVigenere(String cle)
    {
        String chaine= saisieChaine();
        int positionCle=cle.charAt(0);
        char[] tabChaine=chaine.toCharArray();
        String nouvelleChaine="";
        for(int i=0;i<tabChaine.length;i++)
        {
            char c=tabChaine[i];
            
            int valeurUnicode=(int)c; 
            
            if(valeurUnicode<91 && valeurUnicode>64) //A-Z
            {
                int positionA=65+positionCle; 
                if(positionA+valeurUnicode>90) {
                    //il faut forcement que la valeur soit comprise entre 65 et 90
                    do{
                        if(valeurUnicode<65) valeurUnicode+=65;
                        else valeurUnicode=((positionA+valeurUnicode)%90)+65;
                    }while(valeurUnicode>90 || valeurUnicode<65);
                    
        
                }
                
            }
            else if(valeurUnicode<123 && valeurUnicode>96) // Si le caractere est une lettre minuscule
            {
                int positionA=97+positionCle; 
                if(positionA+valeurUnicode>122) {
                    //il faut forcement que la valeur soit comprise entre 97 et 122
                    do{
                        if(valeurUnicode<97) valeurUnicode+=97;
                        else valeurUnicode=((positionA+valeurUnicode)%122)+97;
                    }while(valeurUnicode>122 || valeurUnicode<97);

                }
                
            }
            //Sion il va garde la meme valeur
            char caractereDecale=(char)valeurUnicode; 
            tabChaine[i]=caractereDecale;
        }
        nouvelleChaine=String.valueOf(tabChaine);
        System.out.println(nouvelleChaine);
    }


    public static void main(String[] args) {
        
        //Exo1 
        //String unMot="Bonjour";
        //System.out.println(unMot);

        //Remplacer la valeur contenue par la valeur suivante
        //unMot=unMot.replace("Bonjour :-)", "Au revoir :-("); // replace permet de remplacer 
        //System.out.println(unMot);

        //Exo2 
        // Demandons à l'utilisateur de saisir un mot  
        //Scanner sc=new Scanner(System.in);
        //System.out.println("La conversion est : "+conversionHeure(1000000000));
        //rechercheNombre(5);
        //saisieEntier();
        //miniMaxTrieEnsemble();
        //triInverse();

        //decalages1();
        //sc.close();
        codageVigenere("VIGENERE");
    }
    
}
