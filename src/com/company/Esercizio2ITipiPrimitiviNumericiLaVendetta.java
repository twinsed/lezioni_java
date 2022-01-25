package com.company;

import java.util.Scanner;

public class Esercizio2ITipiPrimitiviNumericiLaVendetta {
    public static void main(String[] args) {
        /* Crea un piccolo programma da terminale che prende in input due variabili e in output restituisce il risultato

        1 - addizione
        2 - sottrazione
        3 - moltiplicazione
        4 - divisione

        Usa i tipi primitivi che preferisci:

        Vedi esempio:
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il primo numero :");
        int primoNumero = input.nextInt();
        System.out.println("Inserisci il secondo numero :");
        int secondoNumero = input.nextInt();
        System.out.println("La somma è " + (primoNumero + secondoNumero));
        input.close();
    }
}
