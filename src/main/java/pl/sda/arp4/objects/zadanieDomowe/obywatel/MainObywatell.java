package pl.sda.arp4.objects.zadanieDomowe.obywatel;

import java.util.Scanner;
/*

Stwórz enum Płeć która posiada wartości: KOBIETA, MĘŻCZYZNA
        Stwórz klasę Obywatel która posiada pola:
        Płeć
        Imie
        Nazwisko
        Pesel
        Stwórz Maina w formie 'formularza' w którym zadajemy użytkownikowi pytania o jego dane (imie, nazwisko, pesel, płeć).
        Zaimplementuj w klasie Obywatel metodę toString.
        Stwórz main’a, w mainie stwórz obiekt Obywatel (Użytkownik podaje informacje o sobie i po podaniu
         wszystkich wartości tworzymy nowy obiekt typu "Obywatel".)
        i pozwól użytkownikowi wpisać wszystkie dane (przemyśl jak zrobić pytanie o płeć).
        stwórz metodę przedstawSię() w której wypisz metodą sout informacje o obywatelu.
        Użyj metody w main

*/


public class MainObywatell {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



       /* System.out.println("Podaj plec: ");
        String plec = scanner.next();
*/
Plec plec = null;

        while(plec == null) {
            System.out.println("Podaj plec: : ");
            String zmiennaString = scanner.next();


        }

        System.out.println("Podaj Imię: ");
        String imie = scanner.next();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();
        System.out.println("Podaj pesel: ");
        String pesel = scanner.next();

        Obywatel obywatel1 = new Obywatel(plec, imie, nazwisko, pesel);

        System.out.println(obywatel1);
        obywatel1.przedstawSie();


    }
}
