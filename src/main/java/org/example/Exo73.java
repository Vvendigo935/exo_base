package org.example;

import java.util.Scanner;

public class Exo73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mettez le numero du mois : ");
        byte mois = scanner.nextByte();
        switch(mois){
            case 1 :
                System.out.println("Le "+mois+"e mois qui est le mois de Janvier possède 31 jours");
                break;
                case 2 :
                System.out.println("Le "+mois+"e mois qui est le mois de Fevrier possède 28 jours et 29 jours une fois tout les 4 ans");
                break;
                case 3 :
                System.out.println("Le "+mois+"e mois qui est le mois de Mars possède 31 jours");
                break;
                case 4 :
                System.out.println("Le "+mois+"e mois qui est le mois d'Avril possède 30 jours");
                break;
                case 5 :
                System.out.println("Le "+mois+"e mois qui est le mois de Mai possède 31 jours");
                break;
                case 6 :
                System.out.println("Le "+mois+"e mois qui est le mois de Juin possède 30 jours");
                break;
                case 7 :
                System.out.println("Le "+mois+"e mois qui est le mois de Juillet possède 31 jours");
                break;
                case 8 :
                System.out.println("Le "+mois+"e mois qui est le mois d'Aout possède 31 jours");
                break;
                case 9 :
                System.out.println("Le "+mois+"e mois qui est le mois de Septembre possède 30 jours");
                break;
                case 10 :
                System.out.println("Le "+mois+"e mois qui est le mois d'Octobre possède 31 jours");
                break;
                case 11 :
                System.out.println("Le "+mois+"e mois qui est le mois de Novembre possède 30 jours");
                break;
                case 12 :
                System.out.println("Le "+mois+"e mois qui est le mois de Decembre possède 31 jours");
                break;
            default:
                System.out.println("Ce chiffre ne correspond pas a un numéro de mois");
        }
    }
    }

