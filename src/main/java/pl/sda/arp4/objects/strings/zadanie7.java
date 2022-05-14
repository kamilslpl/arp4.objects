package pl.sda.arp4.objects.strings;

import java.util.Scanner;
/*
7. Napisz aplikację która przyjmuje od użytkownika tekst, a następnie zamienia cały tekst na:
same duże litery
same małe litery
*/


public class zadanie7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scanner.nextLine();

        System.out.println(tekst);

        String wynik = tekst.toLowerCase();
        System.out.println(wynik);

        String tekstBezPrzecinka = tekst.replaceAll(",", "makarena");

        System.out.println(tekstBezPrzecinka);

    }
}
