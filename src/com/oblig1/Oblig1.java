/*
Obligatorisk oppgave 1, av Salem Hamidi - s333946
 */
package com.oblig1;

import java.util.Arrays;

public class Oblig1 {

    //Oppgave 1
    public static int maks(int[] a) {
        int max_value = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max_value) {
                max_value = a[i];
            }
        }
        return max_value;
    }

    //Oppgave 2
    public static int antallUlikeSortert(int[] a) {

    }
}



/*
            if (a[i] == a[i+1]) {
        throw new NoSuchElementException() {
                       return "Tomt tabellintervall"
        }
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("Test: Intellij - Github");
    }
}

 */
