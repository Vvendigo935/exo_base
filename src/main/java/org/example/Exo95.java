package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exo95 {
    public static void main(String[] args) {
        int tbSource[] = {-5, 3, 24, -12, -10, 5, 100, -2, -71, 0};
        int tbDesti[] = {3, 24, 5, 100, 0, 0, 0, 0, 0, 0};
        for (int i =0; i < 10; i++){
            if (tbSource[i] >= 0){
                tbDesti[i] = tbDesti[i] + tbSource[i];
            }

        }
        System.out.println(Arrays.toString(tbDesti));
    }
}

