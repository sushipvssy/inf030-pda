/*
 * Factorial
 *
 * Version 1.0
 *
 * Open Source
 *
 * Written by Jan Eike Suchard
 */

package vorlesungsbeispiele;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }
        System.out.println(result);
    }
    
}
