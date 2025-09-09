package Esercizio4;
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserire un numero intero:");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0 ; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
