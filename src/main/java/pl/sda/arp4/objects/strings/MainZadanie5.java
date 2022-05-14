package pl.sda.arp4.objects.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MainZadanie5 {
    public static void main(String[] args) {

        /*
       5. Napisz program który zlicza wystąpienia liter w tekście. Posłuż się do tego pętlami for/while. (spróbuj zaimplementować na dwa sposoby).
sposób 1/wskazówka 1: wykorzystaj kody ascii liter i iteruj tekst tyle razy, ile mamy liter w alfabecie i porównuj litery z kodami ascii
*sposób 2/wskazówka 2: wykorzystaj do zliczania dodatkową tablicę.

ala
a = 2
l = 1
string to tablica charow
         */

        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();

        char[] znaki = tekst.toCharArray();

        for (int i = 0; i < znaki.length; i++) {
            char literkaI = znaki[i];

            int licznik = 0;

            for (int j = 0; j < znaki.length; j++) {
                char literkaJ = znaki[j];

                if ((j < i) && (literkaI == literkaJ)) {
                    break;
                }
                if (literkaI == literkaJ) {
                    licznik = licznik + 1;
                }
                }
                if (licznik != 0) {
                    System.out.println(literkaI + "-->" + licznik);
            }
        }
    }
}

