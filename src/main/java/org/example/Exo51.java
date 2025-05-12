package org.example;

import java.util.Scanner;

public class Exo51 {
    public static void main(String[] args) {
        /*
         1. Créer une variable nom et une variable prenom
         2. Afficher la phrase suivante "Bonjour {prenom} {NOM}."
        3. Remplacer les valeurs entre chevrons par les variables créées précédemment
         */
        Scanner scanner = new Scanner(System.in);
        String nom,prenom;
        nom = scanner.next();
        prenom = scanner.next();
        System.out.println("Bonjour "+prenom+" "+nom);
    }
}
