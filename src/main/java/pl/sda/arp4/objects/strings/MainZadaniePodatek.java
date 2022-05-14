package pl.sda.arp4.objects.strings;

import java.util.Scanner;

public class MainZadaniePodatek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj twoj podatek:  ");
        double tekst = scanner.nextDouble();

        if (tekst <= 85528){

            double obliczonyPodatek = (tekst*0.18 - 556.02);
            System.out.println(obliczonyPodatek);

        }






    }
}
