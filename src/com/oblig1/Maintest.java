package com.oblig1;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

import static com.oblig1.Oblig1.antallUlikeUsortert;

public class Maintest {
    /*
        public static boolean inneholdt(String a, String b) {
            if (a.length() == 0 || (b.length() == 0)) {
                return false;
            }

            a = "[ÆØÅ A-Z]";
            Pattern pat = Pattern.compile(a);
            if (a == null) {
                return true;
            }
            return pat.matcher(a).matches();
    }


        public static void main(String[] args) {
            String a = "HEI";
            String b = "HEI";
            System.out.println(inneholdt(a, b));
        }


     */
    public static void rotasjon(char[] a) {
        //Hvis arrayer er tomt, skriv at det er 0
        if (a.length == 0) {
            System.out.println("0");
        }
        //Rotere arrayet mot høyre en enhet
        for (char i = 0; i < 1; i++) {
            //Lagrer hvilken verdi siste tallet har
            char siste = a[a.length - 1];
            //Bytter verdien j-1 enhet
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            //Første verdien får verdien til siste
            a[0] = siste;
        }
    }


    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(a);
        System.out.println(Arrays.toString(a));
    }
}



