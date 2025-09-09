package Esercizio1;

public class Main {
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }
    public static void main (String[] args) {
        String s1 = "Ciao";
        String s2 = "Mondo";

        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(stringaPariDispari("Mondo"));
    }
}
