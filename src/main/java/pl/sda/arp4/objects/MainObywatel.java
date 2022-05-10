package pl.sda.arp4.objects;
import java.util.Scanner;
/*

Stwórz klasę Obywatel z imieniem i numerem pesel (przyjmij String). Stworz pełny konstruktor oraz gettery, settery i metodę toString.
        W klasie MainObywatel napisz nastepujaca logike:
        Stworz scanner
        Popros uzytkownika o podanie imienia
        Popros uzytkownika o podanie numeru pesel
        Stworz obiekt klasy Obywatel uzywajac konstruktora
        Wypisz obiekt na ekran stosujac sout.
*/

public class MainObywatel {
/*
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Obywatel Pinokio = new Obywatel();

        System.out.println("Podaj imie");
        Pinokio.setImie(s.next());
        System.out.println("Podaj numer pesel");
        Pinokio.setPesel(s.nextInt());

        System.out.println("Twoje imie to: " + Pinokio.getImie() + " a twoj PESEL to " + Pinokio.getPesel());
}
*/
          public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Podaj Imię: ");
              String imie = scanner.nextLine();
              System.out.println("Podaj PESEL: ");
              int pesel = scanner.nextInt();


              Obywatel obywatel1 = new Obywatel(imie, pesel);
              System.out.println(obywatel1);
          }
      }







