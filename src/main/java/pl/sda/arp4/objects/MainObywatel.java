package pl.sda.arp4.objects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainObywatel {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Obywatel Pinokio = new Obywatel();

        System.out.println("Podaj imie");
        Pinokio.setImie(s.next());
        System.out.println("Podaj numer pesel");
        Pinokio.setPesel(s.nextInt());

        System.out.println("Twoje imie to: " + Pinokio.getImie() + " a twoj PESEL to " + Pinokio.getPesel());


    }



}
