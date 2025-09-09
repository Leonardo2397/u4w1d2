package Esercizio1;

public class Main2 {

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            // se si divide x 400 è bisestile
            return true;
        } else if (anno % 100 == 0) {
            // se divisibile x 100 ma no  x 400 non è bisestile
            return false;
        } else if (anno % 4 == 0) {
            // se divisibile x 4 ma non x 100 è bisestile
            return true;
        } else {
            //altruimenti sempre falso
            return false;
        }
    }


    public static void main(String[] args) {
        int anno1 = 2020;
        int anno2 = 1900;
        int anno3 = 1600;

        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
        System.out.println("L'anno " + anno3 + " è bisestile? " + annoBisestile(anno3));
    }
}
