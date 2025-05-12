package org.example;

import java.util.Scanner;

public class Exo69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte nbr = scanner.nextByte();
        nbr = (byte) (nbr%2);
        if (nbr == 0){
            System.out.println("Votre nombre est pair");
        }else System.out.println("Votre nombre est impair");
    }
}
