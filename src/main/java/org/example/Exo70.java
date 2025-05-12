package org.example;

import java.util.Scanner;

public class Exo70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte nbr1,nbr2,nbr3,max; //l'énoncé demande de mettre au moins 3 valeurs bien que ce ne soit faisable en 2
        for (byte i = 1; i < 4; i++ ){
            System.out.println("Veuillez entrer le "+i+"e nombre : ");
            if (i==1){
                nbr1 = scanner.nextByte();
            }else if (i == 2){
                nbr2 = scanner.nextByte();
            } else if (i == 3) {
                nbr3  = scanner.nextByte();
            }
        }


        System.out.println("le nombre le plus grand est "+max);
    }}