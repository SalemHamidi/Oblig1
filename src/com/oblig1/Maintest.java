package com.oblig1;

import java.util.Arrays;

public class Maintest {
    public static void rotasjon(char[] a, int k) {
        //Antall plasser den skal rotere mot høyre
        if (a.length == 0) {
            System.out.println("0");
        }
        //Rotere arrayet mot høyre like manger ganger som verdien
        //til antallRotasjoner
        if (k > 0) {
            for (char i = 0; i < k; i++) {
                //Lagrer hvilken verdi siste tallet har
                char siste = a[a.length - 1];
                //Alle elementer flyttes n mot høyre
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                //Første verdien får verdien til siste
                a[0] = siste;
            }
        }
        if(k < 0) {
            for (char i = 0; i < a.length; i--) {
                char første = a[0];

                for (int j = a.length - 1; j < 0; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length -1]= første;
            }
        }
    }
    public static void main(String[] args) {
         char[] a = {'A','B','C','D','E','F','G','H','I','J'};
         System.out.println(Arrays.toString(a));

        rotasjon(a, -2);
        System.out.println(Arrays.toString(a));
    }
}

