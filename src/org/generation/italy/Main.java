package org.generation.italy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Dichiarazione dello scanner e variabili
		Scanner sc = new Scanner(System.in);
		int i, indexProposito;
		
		// Lista dei propositi
		List<String> propositi = new ArrayList<String>();
		propositi.add("Fare più attivita fisica.");
		propositi.add("Esercitarsi sulla OOP.");
		propositi.add("Migliorare le competenze linguistiche.");
		propositi.add("Leggere almeno un fumetto a settimana.");
		propositi.add("Risparmiare per un viaggio.");
		
		// Inizio ciclo do-while per lista propositi e il suo conseguimento
		do {
			// Stampa messaggio + ciclo for per stampa dell'array
			System.out.println("I tuoi buoni propositi per il futuro: ");
			for (i = 0; i < propositi.size(); i++) {
				System.out.println((i + 1) + ". " + propositi.get(i));
			}
			
			// Stampa messaggio per selezione proposito conseguito
			System.out.println("Seleziona il numero di proposito che hai conseguito: ");
			indexProposito = sc.nextInt() - 1;
			sc.nextLine();
			
			// Se il numero inserito è presente rimuove dall'array
			if (indexProposito >= 0 && indexProposito < propositi.size()) {
				System.out.println("Complimenti per aver conseguito il proposito: " + propositi.get(indexProposito));
				propositi.remove(indexProposito);
			// In caso contrario chiede di riprovare perchè il numero non è valido e viene mostrato messaggio	
			} else {
				System.out.println("Numero non valido, riprovare.");
			}
			
		// Il ciclo finisce quando la lista dei propositi è vuota
		} while (!propositi.isEmpty());
		
		// Messaggio di stampa finale una volta uscito dal ciclo
		System.out.println("Complimenti, hai conseguito tutti i tuoi buoni propositi!");
		
	}

}
