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
    public static int antallUlikeUsortert(int[] a) {
        int antall = 0;

       //Går gjennom helle arrayet
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            //Sammenlign i med verdien til j, dersom a
            for (j = 0; j < i; j++) {
                if (a[i] == a[j])
                    break;
            }

            //Dersom elementet ikke har vært tidligere i arrayet legg til 1
            if (i == j)
                antall++;
        }
        return antall;
    }

    public static void main(String[] args) {
        int a[] = {};
        System.out.println(antallUlikeUsortert(a));
    }
}



