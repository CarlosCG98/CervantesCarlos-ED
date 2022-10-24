package ud1.practices;

/*
 * El resultat de l'operaciÃ³ de collatz
 * per a N = 27 desprÃ©s de 12 iteracions
 * Ã©s ????  322
 */

import java.util.Locale;
import java.util.Scanner;

public class DebugCollatz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Introdueix un nÃºmero: ");
        int inicial = in.nextInt();
        int n = inicial;
        int counter = 0;

        while (n !=1) {

            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3) + 1;

            counter++;
        }

        System.out.printf("S'ha arribat del %d al 1 desprÃ©s de %d passos.\n", inicial, counter);
    }
}
