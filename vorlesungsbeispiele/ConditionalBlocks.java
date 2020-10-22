package vorlesungsbeispiele;

import java.util.Random;

public class ConditionalBlocks {

    public static void main(String[] args) {
        Random random = new Random();
        // Zufällige Zahl zwischen -10 und 30 generieren
        int x = random.nextInt(30 + 1) - 10;
        System.out.println("Die Variable x hat den Wert:" + x);
        if (x == 0) {
            System.out.println(0);
        } else if (x > 10) {
            System.out.println(100 / x);
        } else if (x > 0) {
            System.out.println(10 / x);
        } else {
            System.out.println(-1 * x);
        }
    }
}
