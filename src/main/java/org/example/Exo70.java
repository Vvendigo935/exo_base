package org.example;

import java.util.Scanner;

public class Exo70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte nbr1= -0,nbr2 = -0,nbr3 = -0,max = -0; //l'énoncé demande de mettre au moins 3 valeurs bien que ce ne soit faisable en 2 et plus court
        for (byte i = 1; i < 4; i++ ){
            System.out.println("Veuillez entrer le "+i+"e nombre : ");
            if (i==1){
                nbr1 = scanner.nextByte();
                max = nbr1;
            }else if (i == 2){
                nbr2 = scanner.nextByte();
            } else if (i == 3) {
                nbr3  = scanner.nextByte();
            }
        }if (max < nbr2){
            max = nbr2;
        }if (max < nbr3){
            max = nbr3;
        }
        System.out.println("1er nbr :"+nbr1);
        System.out.println("2e nbr :"+nbr2);
        System.out.println("3e nbr :"+nbr3);
        System.out.println("le nombre le plus grand est "+max);
    }}