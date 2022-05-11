package pl.sda.arp4.objects.kalkulator;
import java.util.Scanner;

public class MainPawla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Podaj liczbę pierwszą:");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj liczbę drugą:");
        int liczbaDruga = scanner.nextInt();

        System.out.println("Podaj działanie matematyczne (dodaj/odejmij/pomnoz/podziel):");
        String dzialanie = scanner.next();

        int wynik = 0;
        boolean jestWynik = true;
        switch (dzialanie) {
            case "dodaj":
                wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
                break;
            case "pomnoz":
                wynik = kalkulator.pomnoz(liczbaPierwsza, liczbaDruga);
                break;
            case "podziel":
                try {
                    // try -> blok kodu w którym może wystąpić błąd
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    // catch -> blok który wywoła się tylko jeśli wystąpi błąd
                    //          i go złapiemy
                    System.out.println("Nie można dzielić przez zero!");
                    jestWynik = false;
                }
                break;
            default:
                System.out.println("Niepoprawna komenda!");
                jestWynik = false;
        }

        if (jestWynik) {
            System.out.println("Wynik = " + wynik);
        }
    }
}