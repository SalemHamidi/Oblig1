/*
Obligatorisk oppgave 1, av Salem Hamidi - s333946
 */

package com.oblig1;

import java.util.NoSuchElementException;

public class Oblig1 {

    //Oppgave 1 - ikke fullført
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

    //Oppgave 2 - Fullført
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

    //Oppgave 3 - Fullført
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

    // Oppgave 4
    public static void delSortering(int[] a) {














    }

    //Oppgave 5 - Fullført
    public static void rotasjon(char[] a){
        //Hvis arrayer er tomt, skriv at det er 0
        if(a.length == 0) {
            System.out.println("0");
        }
        //Rotere arrayet mot høyre en enhet
        //i må være større eller lik en dersom for at
        //det ingen feilsituasjon skal oppstå
        for(char i = 0; i <= 1; i++) {
            //Lagrer hvilken verdi siste tallet har
            char siste = a[a.length - 1];
            //Bytter verdien j-1 enhet
            for(int j = a.length - 1; j > 0; j--) {
                a[j] = a[j-1];
            }
            //Første verdien får verdien til siste
            a[0] = siste;
        }
    }
    // Oppgave 6 - ikke fullført
    public static void rotasjon(char[] a, int k) {
        //Antall plasser den skal rotere mot høyre
        if (a.length == 0) {
            System.out.println("0");
        }
        //Rotere arrayet mot høyre like manger ganger som verdien
        //til antallRotasjoner
        if(k > 0) {
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
        //Trenger litt help med rotasjon med nagativ verdi
        if(k < 0) {
            for(char i = 0; i < k; i++) {
                char første = a[0];
                for(int j = a.length - 1; j < k; j++) {
                    a[j] = a[0];
                }
                a[0] = første;
            }
        }
    }

    //Oppgave 7 A
    public static String flett(String s, String t) {
        //Lager strenger som blir laget av s og t
        StringBuilder tekst = new StringBuilder();

        //For-løkken går igjennom alle verdiene i Streng s
        for(int i = 0; i < s.length(); i++) {
            if (i < s.length()) {
                tekst.append(s.charAt(i));
            }
        }
        //For-løkken går igjennom alle verdiene i Streng t
        for(int i = 0; i < t.length(); i++) {
            if(i < t.length()){
                tekst.append(t.charAt(i));
            }
        }
        return tekst.toString();
    }
    //Oppgave 7
    /*
    public static String flett2(St  ring s) {

    }
     */
    //Oppgave 8
/*
    public static int[] indekssortering(int[] a) {

    }
*/
    //Oppgave 9
/*
    public static int[] tredjeMin(int[] a) {

    }
*/
/*
    //Oppgave 10
    public static boolean inneholdt(String a, String b){
        if (a == null) {
            return true;
        }
        if(a.contains("[A-Z]") || b.contains("[A-Z]")) {
            return true;
        }


    }
*/
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