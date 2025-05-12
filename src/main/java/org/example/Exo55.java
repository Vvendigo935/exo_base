package org.example;

import java.util.Scanner;

public class Exo55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r,h,v;
        System.out.println("Mettez le rayon");
        r = scanner.nextInt();
        System.out.println("Mettez la hauteur");
        h = scanner.nextInt();

        v= 1f / 3f * Math.PI * (r*r) * h;
        v=v*100;
        v=Math.round(v);
        v=v/100;
        System.out.println("le volume du cone est : "+v+" cm3");

    }
}
