package Esercizio3;

import java.util.Scanner;

public class SplittaStringa {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("inserisci una stringa (':q' per terminare)");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("programma terminato");
                break;
            }

            char[] caratteri = input.toCharArray();
               // ciclo i caratteri
            for (int i = 0; i < caratteri.length; i++) {
                // all ultimo carattere non metto la virgola
                if (i == caratteri.length - 1) {
                    System.out.print(caratteri[i]);
                } else {
                    // se non è ultimo caratt stampa con la virgola dopo
                    System.out.print(caratteri[i] + ",");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
