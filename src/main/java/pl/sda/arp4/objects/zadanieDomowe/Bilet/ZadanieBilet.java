package pl.sda.arp4.objects.zadanieDomowe.Bilet;

import java.util.Arrays;
import java.util.Scanner;

public class ZadanieBilet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RodzajBiletu rodzaj = null;

        do {
            /*
           System.out.print("Podaj rodzaj biletu (dostepne rodzaje:" + Arrays.toString(RodzajBiletu.values())+ "):");
            */
            for (RodzajBiletu rodzajBiletu : RodzajBiletu.values()) {
                System.out.println(rodzajBiletu + " ");
            }
            System.out.println("):");
            String wpisaneSlowo = scanner.next();
            try{
                rodzaj =RodzajBiletu.valueOf(wpisaneSlowo);

            }catch (IllegalArgumentException iae){
                System.err.println("Nie ma takiej opcji");
            }

        }while (rodzaj!=null);

        double cena = 0.0;
        switch (rodzaj) {
            case ULGOWY_EMERYT:
                cena = 0.3d;
                break;
            case NORMALNY_GODZINA:
                cena = 1.7d;
                break;
            case ULGOWY_STUDENCKI:
                cena = 0.9d;
                break;
            case NORMLANY_CALODNIOWY:
                cena = 5.3d;
                break;
                        }
        System.out.println("Podaj ilość biletów ktore chcesz kupic");
        int iloscBiletow = scanner.nextInt();
        System.out.println("Cena biletow to:" + (iloscBiletow*cena));

    }
}
