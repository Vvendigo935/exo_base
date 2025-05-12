package org.example;

import java.util.Scanner;

public class Exo53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Mettez le 1er chiffre");
        a = scanner.nextInt();
        System.out.println("Mettez le 2e chiffre");
        b = scanner.nextInt();

        a = a*a;
        b = b*b;
        a = a+b;

        System.out.println("la somme de leurs carré est : "+a);
    }
}
