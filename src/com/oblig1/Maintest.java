package com.oblig1;

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
    public static int antallUlikeSortert(int[] a, int n) {
        int antall = 1;
        //Sjekker om arrayet er tomt
        if (a.length == 0) {
            return 0;
        }
        //Går gjennom hele arrayet
        for (int i = 1; i < a.length; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j){
                antall++;
            }
        }
        return antall;
    }

    public static void main(String[] args) {
        int[] a = {4, 72, 24};
        System.out.println(a, a.length);



    }
}




