package org.example;

import java.util.Scanner;

public class Exo72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place du jour de la semaine : ");
        byte jour = scanner.nextByte();
        switch(jour){
            case 1 :
                System.out.println("Le "+jour+"e jour de la semaine est Lundi");
                break;case 2 :
                System.out.println("Le "+jour+"e jour de la semaine est Mardi");
                break;case 3 :
                System.out.println("Le "+jour+"e jour de la semaine est Mercredi");
                break;case 4 :
                System.out.println("Le "+jour+"e jour de la semaine est Jeudi");
                break;case 5 :
                System.out.println("Le "+jour+"e jour de la semaine est Vendredi");
                break;case 6 :
                System.out.println("Le "+jour+"e jour de la semaine est Samedi");
                break;case 7 :
                System.out.println("Le "+jour+"e jour de la semaine est Dimanche");
                break;
            default:
                System.out.println("Ce chiffre ne correspond pas");
    }
    }
}
