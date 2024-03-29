/*
Obligatorisk oppgave 1, av Salem Hamidi - s333946
 */
package com.oblig1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1 - Completed
    public static int maks(int[] a) {

        //Throw an exception if the length of the array is less then one
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen er tomt");
        }

        int max_value = a[0];

        //Index of the temporary highest value
        for (int i = 1; i < a.length; i++) {
            if (max_value > a[i]) {
                a[i - 1] = a[i];
                a[i] = max_value;
            }
            max_value = a[i];
        }
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a.length < 1) {
            throw new NoSuchElementException("Tabellen er tom");
        }
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int ombyttinger = a[i];
                a[i] = a[i + 1];
                a[i + 1] = ombyttinger;
                antall++;
            }
        }
        return antall;
    }

    //Oppgave 2 - Completed
    public static int antallUlikeSortert(int[] a) {
        //Checking if the list is empty
        if (a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (!(a[i] <= a[i + 1])) {
                throw new IllegalStateException("Tabellen er ikke sortert i stigende rekkefølge");
            }
        }
        int antall = 1;
        int temp = a[0];
        //Checking if the list is in ascending array
        for (int i = 1; i < a.length; i++) {
            //Since the list is in acending order
            //we only need to check if the number before and
            //after are alike, if they are not then add one
            if (a[i] > temp) {
                antall++;
                temp = a[i];
            }
        }
        return antall;
    }

    //Oppgave 3 - Completed
    public static int antallUlikeUsortert(int[] a) {
        int count = 0;

        //Loop through the array from 0 to the list length
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            //If the number have been earlier in the list break
            for (j = 0; j < i; j++) {
                if (a[i] == a[j])
                    break;
            }
            //If the value havent been earlier in the list add one
            if (i == j)
                count++;
        }
        return count;
    }

    // Oppgave 4
    public static void delsortering(int[] a) {
        //If the length of list is less then one return the same array
        if (a.length < 1) {
            return;
        }
/*
        int v = 0;
        int h = a.length - 1;
        int i = 0;
        while (i < a.length) {
            while (v < h) {
                while (a[v] % 2 != 0) {
                    v++;
                }
                while (a[h] % 2 == 1) {
                    h--;
                }
                if (v < h) {
                    int temp = a[v];
                    a[v] = a[h];
                    a[h] = temp;
                    v++;
                    h++;
                }

            }
        }
        */

    }

    //Oppgave 5 - Completed
    public static void rotasjon(char[] a) {
        //If the list is empty or has one element return the same list
        if (a.length <= 1) {
            return;
        }
        int antallrotasjoner = 1;
        //Rotate the list one element to the right
        for (char i = 0; i < antallrotasjoner; i++) {
            //Save with value the last element has
            char siste = a[a.length - 1];
            //Change the value j-1
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            //Change the first value with the last value
            a[0] = siste;
        }
    }

    //Oppgave 6 - Completed
    public static void rotasjon(char[] a, int k) {
        //If the list is empty or has value one return same list
        if (a.length == 0) {
            return;
        }
        if (a.length == 2) {
            //Rotate the list to the right as many times as the value of k
            if ((k %= a.length) == 1) {
                rotasjon(a);
                //Saves the value of the last element
                char siste = a[a.length - 1];
                //Move alle element k-times to the right
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                //Give the first value to the last
                a[0] = siste;
            }
        }
        //If the value of k-times to the right is a negative number
        if ((k %= a.length) == 0) {
            for (char i = 0; i < k + a.length; i++) {
                //Saves the value of the last element
                char siste = a[a.length - 1];
                //Move alle element k-time to the right
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                //Give the first value to the last
                a[0] = siste;
            }
        }
    }

    //Oppgave 7 A - Completed
    public static String flett(String s, String t) {
        //Create a new string from string s and string t
        StringBuilder tekst = new StringBuilder();

        //Loop throgh all the letters in string s and string t
        for (char i = 0; i < s.length() || i < t.length(); i++) {
            //Choose the value of i as long as the lenght of the string is less
            //then string s
            if (i < s.length()) {
                tekst.append(s.charAt(i));
            }
            //Choose the value of i as long as the lenght of the string is less
            //then string t
            if (i < t.length()) {
                tekst.append(t.charAt(i));
            }
        }
        return tekst.toString();
    }
    //Oppgave 7B - Ikke fullført

    public static String flett(String... s) {
        StringBuilder tekst = new StringBuilder();

        int lengde = 0;

        for (int i = 0; i < s.length; i++) {
            lengde = lengde + s[i].length();
        }

        for (int i = 0; i < lengde; i++) {
            for (int j = 0; j < s.length; j++) {
                if (i < s[j].length()) {
                    tekst.append(s[j].charAt(i));
                }
            }
        }
        return tekst.toString();
    }

    //Oppgave 8 - ikke fullført
    public static int[] indekssortering(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }
        return null;
    }


    //Oppgave 9 - Completed
    public static int[] tredjeMin(int[] a) {
        //If the length of the array is less then two throw exception
        if (a.length < 3) {
            throw new NoSuchElementException("Arrayet har mindre enn tre verdier");
        }
        //Index of the element with the smallest value
        int m = 0;
        //Index of the element with the second smallest value
        int nm = 1;
        //Index of the element with the third smallest value
        int nnm = 2;
        //If the value of the element of the second smallest index is less then the value
        //of the value of the smallest index change places
        if (a[nm] < a[m]) {
            m = 1;
            nm = 0;
        }
        //If the value of the element of the third smallest index is less then the value
        //of the value of the smallest index change places
        if (a[nnm] < a[m]) {
            int temp = nnm;
            nnm = m;
            m = temp;
        }
        //If the value of the element of the third smallest index is less then the value
        //of the value of the second smallest index change places
        if (a[nnm] < a[nm]) {
            int temp = nnm;
            nnm = nm;
            nm = temp;
        }

        //Value of a[0]
        int minste = a[m];
        //Value of a[1]
        int nestminste = a[nm];
        //Value of a[2]
        int tredjminste = a[nnm];
        //Loop through the whole list
        for (int i = 3; i < a.length; i++) {
            //If a[i] is less then third smallest
            if (a[i] < tredjminste) {
                //If a[i] is less then second smallest
                if (a[i] < nestminste) {
                    //If a[i] is less then smallest
                    if (a[i] < minste) {
                        nnm = nm;
                        tredjminste = nestminste; //new third smallest
                        nm = m;
                        nestminste = minste; //new second smallest
                        m = i;
                        minste = a[i]; //new smallest
                    }
                    //If third samllest is less then second smallest
                    else {
                        nnm = nm;
                        tredjminste = nestminste;
                        nm = i;
                        nestminste = a[i];
                    }
                }
                //If third smallest is less then smalles
                else {
                    nnm = i;
                    tredjminste = a[i];
                }
            }
        }
        return new int[]{m, nm, nnm};
    }

    //Oppgave 10 - Completed
    public static boolean inneholdt(String a, String b) {
        //If a and b is similar return true;
        if (a.equals(b)) {
            return true;
        }
        //If a is empty return true;
        if (a.equals("")) {
            return true;
        }
        //If b is empty return false;
        if (b.equals("")) {
            return false;
        }
        //If b is shorter than a return false;
        if (b.length() < a.length()) {
            return false;
        }

        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        a = new String(a1);
        b = new String(b1);

        int lik = 0;

        for (int i = 0; i < b.length(); i++) {
            if (lik < a.length()) {
                if (b.charAt(i) == a.charAt(lik)) {
                    lik++;
                }
            }
        }

        if (lik == a.length()) {
            return true;
        }
        else{
            return false;
        }
    }
}
