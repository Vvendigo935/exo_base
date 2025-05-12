package org.example;

import java.util.Scanner;

public class Exo57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez la longueur d'un carré :");
        int longueur = scanner.nextInt();
        System.out.println("Le périmetre du carré est de : "+longueur*4+" cm");
        System.out.println("L'aire du carré est de : "+longueur*longueur+" cm carré");
    }
}
