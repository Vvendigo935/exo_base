package org.example;

import java.util.Scanner;

public class Exo54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mettez votre age");
        int age = scanner.nextInt();
        System.out.println(age >= 18);
    }
}
