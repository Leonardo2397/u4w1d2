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

            for (int i = 0; i < caratteri.length; i++) {
                if (i == caratteri.length - 1) {
                    System.out.print(caratteri[i]);
                } else {
                    System.out.print(caratteri[i] + ",");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
