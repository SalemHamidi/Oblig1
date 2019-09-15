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
    public static int maks(int[] a) {
        int max_value = 0;
        if (a.length > 0) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[i - 1]) {
                    max_value = a[i];
                }
            }
            return max_value;
        }
       else{
            throw new NoSuchElementException("Arrayet er tomt");
        }
    }

    public static void main(String[] args) {
        int[] a = {};
        System.out.println(maks(a));



    }
}




