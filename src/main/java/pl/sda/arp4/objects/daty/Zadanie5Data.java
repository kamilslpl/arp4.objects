package pl.sda.arp4.objects.daty;

/*
4. Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
Masz X lat, Y miesięcy, Z dni. (użyj Period)
Masz XYZ sekund. (użyj Duration)
*/


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie5Data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println();
        System.out.println("Wpisz date w formacie yyyy-MM-dd: HH:mm a policze lata" );
        String wpisanaData1 = scanner.nextLine();                                   // 1988-05-10
        LocalDateTime data1 = LocalDateTime.parse(wpisanaData1, formatter1);

        LocalDateTime dataTeraz = LocalDateTime.now();
        System.out.println("Obecna data to: " + dataTeraz);
        System.out.println();

        Period period = Period.between(data1.toLocalDate(), dataTeraz.toLocalDate());
        Duration duration = Duration.between(data1, dataTeraz);

        System.out.println("Masz " + period.getYears() + " lat " + period.getMonths() + " miesiecy i " +
                period.getDays() + " dni"
                );

        System.out.println("Masz " + period.getYears() + " lat, " + period.getMonths() + " miesięcy i " + period.getDays() + " dni");
        System.out.println("Masz " + duration.getSeconds() + " sekundy");
    }
}
