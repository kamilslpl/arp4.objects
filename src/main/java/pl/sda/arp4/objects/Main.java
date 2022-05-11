package pl.sda.arp4.objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// wypisanie wszystkich opcji ENUM
        for (RodzajPojazdu rodzaj : RodzajPojazdu.values()) {
            System.out.println(rodzaj);

        }
        Scanner scanner = new Scanner(System.in);

        RodzajPojazdu zmienna = null;

        while(zmienna == null) {
            System.out.println("Podaj rodzaj pojazdu: ");
            String rodzajString = scanner.next();


            try {
                zmienna = RodzajPojazdu.valueOf(rodzajString.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje...");
            }

        }
        System.out.println(zmienna);
    }
}
