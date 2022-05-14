package pl.sda.arp4.objects.daty;

/*
2. Napisz aplikację, która wyświetli datę (wpisaną ze scannera)
 sprzed 10 dni i datę za dziesięć dni.
 Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.

3. Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
Wskazówka: skorzystaj z klasy Period:
Period period = Period.between(data_start, data_stop);

*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie2Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz date:");
        String wpisane = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataWpisana = LocalDate.parse(wpisane, formatter);
        System.out.println("Wpisana data to :" + dataWpisana);
        LocalDate dataWpisanaPlus10 = dataWpisana.plusDays(10);
        System.out.println("Wpisana data +10 to :" + dataWpisanaPlus10);

        LocalDate dataWpisanaMinus10 = dataWpisana.minusDays(10);
        System.out.println("Wpisana data -10 to :" + dataWpisanaMinus10);
    }
}
