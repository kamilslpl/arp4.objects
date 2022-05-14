package pl.sda.arp4.objects.daty;

import pl.sda.arp4.objects.RodzajPojazdu;

import java.util.Scanner;
/*

5. Napisz program “AutostradaBursztynowa” do naliczania opłat za przejazd pojazdów.
        Stwórz klasę Pojazd, dodaj do niej:
        pole identyfikujące jednoznacznie pojazd
        String nrRejestracyjny
        pola które będą potrzebne do obliczenia czasu przejazdu
        LocalDateTime czasWjazdu;
        LocalDateTime czasWyjazdu;
        pole określające rodzaj pojazdu, na podstawie tego pola będziemy naliczali inną opłatę dla pojazdów osobowych, ciężarowych i jednośladów
        Stworzyć enum
RodzajPojazdu
OSOBOWY - cena 3.2
        CIEZAROWY - cena 5.9
        JEDNOSLAD - cena 1.1
        Stwórz klasę Main i w niej użytkownik wprowadza wszystkie dane pojazdu. Po ich podaniu wypisz użytkownikowi informację: “Zarejestrowano wjazd”
        Po tym odczytaj od użytkownika linię tekstu lub słowo. Jeśli użytkownik wpisze: “wyjazd” to program powinien obliczyć ile czasu minęło od momentu zarejestrowania wjazdu do momentu wpisania “wyjazd” i obliczyć opłatę.
        Wypisz wynik obliczenia. (edited)
*/


public class Zadanie6PojazdDaty {
    public static void main(String[] args) {
// wypisanie wszystkich opcji ENUM
        for (RodzajPojazduData rodzaj : RodzajPojazduData.values()) {
            System.out.println(rodzaj);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rejestracje: ");
        String numerrejstracyjny = scanner.nextLine();

        RodzajPojazduData rodzajPojazdu = null;
        while(rodzajPojazdu == null) {

            System.out.println("Podaj rodzaj pojazdu: ");
            String rodzajPojazduString = scanner.nextLine();

            try {
                rodzajPojazdu = RodzajPojazduData.valueOf(rodzajPojazduString.toUpperCase());
            } catch (IllegalArgumentException iae) {
                System.out.println("Wybrana opcja nie istnieje...");
            }

        }
        System.out.println(rodzajPojazdu);
        PojazdData nowypojazd = new PojazdData(numerrejstracyjny, rodzajPojazdu);

    }
}
