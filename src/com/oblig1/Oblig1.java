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

        int antall = 1;
        //Sjekker om koden er sortert i stigende rekkefølge
        if (a[0] < a[1]) {
            throw new IllegalStateException("Arrayet er ikke sortert i stigende rekkefølge");
        }
        //Sjekker om tabellen er tom;
        if (a.length == 0){
            return 0;
        }

        for(int i = 0; i < a. length -1; i++) {
            //Siden tabellen er på stigende rekkefølge
            //trenger vi kun å sjekke om tallet før og etter er
            //like, dersom de ikke er like skal metoden telle
            if(a[i] != a[i+1]){
                antall++;
            }
        }
        return antall;
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
