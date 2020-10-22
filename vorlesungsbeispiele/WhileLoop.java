package vorlesungsbeispiele;

import java.util.Random;

public class WhileLoop {

    public static void main(String[] args) {
        int x = 0;
        /*
        Zufällige obere Grenze für die while-Schleife festlegen, damit der Code dynamisch sein kann um für Abwechslung
        zu sorgen.
         */
        int y = new Random().nextInt(15) + 1;
        while (x < y) {
            //Austauschbar mit: x = x + 1;
            x++;
            System.out.println(x);
        }
    }
}
