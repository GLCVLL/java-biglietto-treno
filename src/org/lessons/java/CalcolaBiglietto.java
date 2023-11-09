package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        // Chiedo all'utente di inserire il numero di chilometri e l'età
        System.out.print("Inserisci il numero di chilometri che vuoi percorrere: ");
        double km = scanner.nextDouble();

        System.out.print("Inserisci l'età del passeggero: ");
        int età = scanner.nextInt();
        
        // Calcolo il prezzo del biglietto
        double prezzoBase = km * 0.21;
        double prezzoFinale;

        if (età < 18) {
            // Sconto del 20% per i minorenni
            prezzoFinale = prezzoBase * 0.8;
        } else if (età >= 65) {
            // Sconto del 40% per gli over 65
            prezzoFinale = prezzoBase * 0.6;
        } else {
            prezzoFinale = prezzoBase;
        }

        System.out.println("Il prezzo del biglietto è: " + prezzoFinale + "€");

	}
}
