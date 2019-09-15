package com.oblig1;

import java.util.NoSuchElementException;
import java.util.regex.Pattern;

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
    public static int antallUlikeSortert(int[] a) {
        int antall = 1;
        //Sjekker om tabellen er tom;
        if (a.length == 0) {
            return 0;
        }
        //Sjekker om koden er sortert i stigende rekkefølge
        if (a[0] > a[1]) {
            throw new IllegalStateException("Arrayet er ikke sortert i stigende rekkefølge");
        }

        for (int i = 0; i < a.length - 1; i++) {
            //Siden tabellen er på stigende rekkefølge
            //trenger vi kun å sjekke om tallet før og etter er
            //like, dersom de ikke er like skal metoden telle
            if (a[i] != a[i + 1]) {
                antall++;
            }
        }
        return antall;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 3,};
        System.out.println(antallUlikeSortert(a));



    }
}




