package pl.sda.arp4.objects.strings;

import java.util.Scanner;
/*

6. Napisz program który wczytuje od użytkownika tekst, a następnie
        dla tego tekstu zamienia wszystkie wystąpienia przecinków (“, “) na słowo “makarena”. (replaceAll)
*/


public class zadanie6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst");
        String tekst = scanner.nextLine();

        System.out.println(tekst);

        String tekstBezPrzecinka = tekst.replaceAll(",", "makarena");

        System.out.println(tekstBezPrzecinka);

    }
}
