package org.example;

import java.util.Arrays;

public class Exo56 {
    public static void main(String[] args) {

        String chaine = "CoMMent çA vA ?";
        System.out.println(chaine);
        System.out.println(chaine.toLowerCase());
        System.out.println(chaine.toUpperCase());
        String[] tableau = {"c","o","m","m","e","n","t"," ","ç","a"," ","v","a"," ","?"};
        System.out.println(Arrays.toString(Arrays.stream(tableau).toArray()));
        System.out.println("Comment Ça Va ?"); // oui j'ai pas vraiment trouvé

    }
}
