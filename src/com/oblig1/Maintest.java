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
    /*
    public static String flett(String... s) {
        StringBuilder tekst = new StringBuilder();
        //For-løkken går igjennom alle verdiene i Streng s og Streng t.
        for(char i = 0; i < s.length; i++) {
            //Velger tegnet som er plassert på plassen til i så lenge
            //den er mindre en lengden på strengen s
            s = s[];
            if (i < s.length) {
                s = s[i];
                tekst.append(s[i].charAt(i));
            }
            //Velger tegnet som er plassert på plassen til i så lenge
            //den er mindre en lengden på strengen t
        }
        return tekst.toString();
    }

    public static void main(String[] args) {
        String a = flett("AM ","L","GEDS","ORATKRR","","R TRTE","IO","TGAUU");
        System.out.println(a);

    }

     */
    /*

    public static int[] tredjeMin(int[] a) {
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
                //Dersom tredjminste er mindre enn ny
                else {
                    nnm = i;
                    tredjminste = a[i];
                }
            }
        }
        return new int[]{ m, nm, nnm};
    }
*/
    public static int[] indekssortering(int[] a) {
        int k = 0;


        for(int i = 2; i < a.length; i++) {
            int aa = i;
            int bb = i -1;
            if(a[aa] < a[bb]) {
                bb = aa;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] a = {6, 10, 16, 11, 7, 12, 3, 9, 8, 5};

        System.out.println(Arrays.toString(indekssortering(a)));
    }
}