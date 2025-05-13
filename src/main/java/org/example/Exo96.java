package org.example;

public class Exo96 {
    public static void main(String[] args) {
        int max=0;
            int tb[] = {23, 150, 12, 28, 59, 2};
            for (int i =0; i < 6; i++){
                if (i==0){
                    max = tb[0];
                }else if(tb[i] > max){
                    max = tb[i];
                }}
        System.out.println("Le nombre le plus grand du tableau est : "+max);
    }
}
