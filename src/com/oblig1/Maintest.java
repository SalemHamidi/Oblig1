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
    /*
    public static void rotasjon(char[] a, int k) {
        //Antall plasser den skal rotere mot høyre
        if (a.length <= 1) {
            return;
        }
        //Rotere arrayet mot høyre like manger ganger som verdien
        //til antallRotasjoner
        int j;
        if (k < 0) {
            for (char i = 0; i < a.length - 1; i++) {
                //Lagrer hvilken verdi siste tallet har
                char siste = a[a.length - 1];
                //Alle elementer flyttes n mot høyre
                for (j = a.length - 1; j < k; j++) {
                    a[j] = a[j - 1];
                }
                //Første verdien får verdien til siste
                a[i] = k;
            }
        }
        //Trenger litt help med rotasjon med negativ verdi
/*
        if (k > 0) {
            for (char i = 0; i < k; i++) {
                //Lagrer hvilken verdi siste tallet har
                char siste = a[a.length - 1];
                //Alle elementer flyttes n mot høyre
                for (j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                //Første verdien får verdien til siste
                a[0] = siste;
            }
        }

    }




    public static void main(String[] args) {
        char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        rotasjon(a, 4);
        System.out.println(Arrays.toString(a));

        rotasjon(a, -4);
        System.out.println(Arrays.toString(a));
    }
}

*/
    public static String flett(String s, String t) {
        //Lager strengen som blir produkten av koden nedfor
        //laget av variabel s og variabel t
        StringBuilder tekst = new StringBuilder();

        //For-løkken går igjennom alle verdiene i Streng s og Streng t.
        //
        for(char i = 0; i < s.length() || i < t.length(); i++) {
            //Velger tegnet som er plassert på plassen til i så lenge
            //den er mindre en lengden på strengen s
            if (i < s.length()) {
                tekst.append(s.charAt(i));
            }
            //Velger tegnet som er plassert på plassen til i så lenge
            //den er mindre en lengden på strengen t
            if(i < t.length()){
                tekst.append(t.charAt(i));
            }
        }
        return tekst.toString();
    }

    public static void main(String[] args) {
        String a = flett("ABC","DEFGH");
        String b = flett("IJKLMN","OPQ");
        String c = flett("","AB");
        System.out.println(a + "​ ​" + b + "​ ​" + c);
    }
}