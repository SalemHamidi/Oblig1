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

        //Trenger hjelp å løse rotasjon med negative verdier
        if (k < 0) {
            char første = a[0];
            for (int i = 0; i < k; i++) {
                for (char j = 0; j < k - 1; j++) {
                    a[i] = a[i + 1];
                }
                a[i] = første;
            }

        }
    }

    public static void main(String[] args) {
         char[] a = {'A','B','C','D','E','F','G','H','I','J'};
         System.out.println(Arrays.toString(a));

        rotasjon(a, -1);
        System.out.println(Arrays.toString(a));
    }
}

