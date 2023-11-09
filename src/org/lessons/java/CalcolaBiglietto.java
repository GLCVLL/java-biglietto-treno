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
	}
}
