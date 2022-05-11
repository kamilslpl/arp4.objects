package pl.sda.arp4.objects.kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Podaj liczbe pierwszą:");
        int liczbaPierwsza = scanner.nextInt();
        System.out.println("Podaj liczbe druga:");
        int liczbaDruga = scanner.nextInt();


        System.out.println("Podaj dzialanie matematyczne:");
        String dzialanie = scanner.next();

        switch (dzialanie){
            case "dodaj":
                int wynik = kalkulator.dodaj(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
                break;
            case "odejmij":
                wynik = kalkulator.odejmij(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
                break;
            case "pomnoz":
                wynik= kalkulator.pomnoz(liczbaPierwsza, liczbaDruga);
                System.out.println("Wynik = " + wynik);
            break;
            case "podziel":
                try {
                    wynik = kalkulator.podziel(liczbaPierwsza, liczbaDruga);
                    System.out.println("Wynik = " + wynik);
                } catch (ArithmeticException nazwaZmiennejWyjatku) {
                    System.out.println("Nie mozna dzielic przez 0");
                }
                break;
        }
    }
}
