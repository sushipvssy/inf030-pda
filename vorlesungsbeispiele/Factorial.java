package vorlesungsbeispiele; //Nur nötig, da die Datei in einem Unterverzeichnis des Hauptordners liegt

//Klassendeklaration
public class Factorial {

    //Deklaration des Hauptprogramms
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
