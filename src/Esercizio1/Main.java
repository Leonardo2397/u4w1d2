package Esercizio1;

public class Main {
    public static boolean stringaPariDispari(String s) { //riceve una stringa e restituisce un boolean
        return s.length() % 2 == 0; // se la lenght della string è divisibile per 2 è pari
    }
    public static void main (String[] args) {
        String s1 = "Ciao";
        String s2 = "Mondo";

        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(stringaPariDispari("Mondo"));
    }
}
