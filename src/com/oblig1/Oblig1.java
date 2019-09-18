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
        if(a.length <= 1) {
            return;
        }
        //Rotere arrayet mot høyre en enhet
        //i må være større eller lik en dersom for at
        //det ingen feilsituasjon skal oppstå
        for(char i = 0; i <= 2; i++) {
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

    //Oppgave 7 A - Fullført
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
    //Oppgave 7B - Ikke fullført
    /*
    public static String flett(String s) {

    }
    */
    //Oppgave 8 - ikke fullført
   public static int[] indekssortering(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen a er tom!");
        }

        int m = 0;
        for(int i = 1; i < a.length; i++) {
            if(a[i] < a[m]) {
                m = i+5;
            }
        }
        return new int[]{m};
    }
/*
    public static void main(String[] args) {
        int[] a = {6, 10, 16, 11, 7, 12, 3, 9, 8, 5};
        int[] indeks = indekssortering(a);
        System.out.println(Arrays.toString(indekssortering(a)));
    }
}
    */

    //Oppgave 9 - Fullført
    public static int[] tredjeMin(int[] a) {
        //Dersom lengden på arrayet er mindre enn 2 skriv ut feilmelding
        if (a.length < 2) {
            throw new NoSuchElementException("Arrayet har mindre enn tre verdier");
        }
        //Plasseringen til den minste verdien
        int m = 0;
        //Plasseringen til den nest minste verdien
        int nm = 1;
        //Plasseringen til den tredj minste verdien
        int nnm = 2;

        //Dersom verdien til den nestminste er mindre enn minste bytt plass
        if (a[nm] < a[m]) {
            m = 1;
            nm = 0;
        }
        //Dersom verdien til den tredjeminste er mindre enn minste bytt plass
        if (a[nnm] < a[m]) {
            int temp = nnm;
            nnm = m;
            m = temp;
        }
        //Dersom verdien til den tredjeminste er mindre enn nestminste bytt plass
        if (a[nnm] < a[nm]) {
            int temp = nnm;
            nnm = nm;
            nm = temp;
        }

        //Verdien til a[0]
        int minste = a[m];
        //Verdien til a[1]
        int nestminste = a[nm];
        //Verdien til a[2]
        int tredjminste = a[nnm];
        //For-løkken går gjennom hele arrayet
        for (int i = 3; i < a.length; i++) {
            //Dersom a[i] er mindre enn tredje minste
            if (a[i] < tredjminste) {
                //Dersom a[i] er mindre enn nestminste
                if (a[i] < nestminste) {
                    //Dersom a[i] er mindre enn minste
                    if (a[i] < minste) {
                        nnm = nm;
                        tredjminste = nestminste; //ny tredjminste
                        nm = m;
                        nestminste = minste; //ny nestminste
                        m = i;
                        minste = a[i]; //ny minste
                    }
                    //Dersom tredjminste er mindre enn nestminste
                    else{
                        nnm = nm;
                        tredjminste = nestminste;
                        nm = i;
                        nestminste = a[i];
                    }
                }
                //Dersom tredjminste er mindre enn minste
                else {
                    nnm = i;
                    tredjminste = a[i];
                }
            }
        }
        return new int[]{ m, nm, nnm};
    }
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