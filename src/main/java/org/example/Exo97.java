package org.example;

public class Exo97 {
    public static void main(String[] args) {
        int tbA[]={1,2,3,4};
        int tbB[]={1,2,3,4};
        int tbC[]={1,2,3,5};
        for (int i=0;i<4;i++){
            if(tbA[i] == tbC[i]) System.out.println("Cette partie du tableau est similaire");
            else System.out.println("Cette partie du tableau n'est pas similaire");
        }
    }//mettez le tableau B si vous voulez test aussi
}
