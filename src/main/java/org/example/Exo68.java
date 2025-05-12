package org.example;

import java.util.Scanner;

public class Exo68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre age svp : ");
        byte age = scanner.nextByte();
        if (age <= 17){
            System.out.println("Vous avez "+age+" ans vous ne pouvez pas entrer dans le club, car vous êtes mineur");
        }else System.out.println("Vous avez "+age+" ans vous pouvez donc entrer dans le club");
    }
}
