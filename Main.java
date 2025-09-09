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
    public static int saisieDouble()
    {
        System.out.println("Veuillez saisir un entier");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
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


    public static void main(String[] args) {
        
        //Exo1 
        String unMot="Bonjour";
        System.out.println(unMot);

        //Remplacer la valeur contenue par la valeur suivante
        unMot=unMot.replace("Bonjour :-)", "Au revoir :-("); // replace permet de remplacer 
        System.out.println(unMot);

        //Exo2 
        // Demandons à l'utilisateur de saisir un mot  
        Scanner sc=new Scanner(System.in);
        sc.close();

        
        
        
    }
    
}
