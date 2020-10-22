package vorlesungsbeispiele;

import java.util.Random;

public class ConditionsExtended {

    public static void main(String[] args) {
        Random random = new Random();
        // Zufällige Zahl zwischen -10 und 25 generieren
        int x = random.nextInt(25 + 1) - 10;
        if (x == 0) {
            System.out.println(x);
        }
        if (x > 10) {
            System.out.println(x);
        }
        if (x < 10) {
            System.out.println(x);
        }
        if (x != 0) {
            System.out.println(x);
        }
        if (x >= 5 && x <= 10) {
            System.out.println(x);
        }
        if (x <= 5 || x >= 10) {
            System.out.println(x);
        }
    }
}
