package Esercizio2;

import java.util.Scanner;

public class NumeriInLettere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        chiedo di inserire un numero
          System.out.print("Inserire un numero intero");
          int numero = scanner.nextInt();

          switch(numero) {
              case 0:
                  System.out.println("zero");
                  break;
              case 1:
                  System.out.println("uno");
                  break;
              case 2:
                  System.out.println("due");
                  break;
              case 3:
                  System.out.println("tre");
                  break;
              default:
                  System.out.println("Errore: numero non compreso");
          }
          scanner.close();
    }
}
