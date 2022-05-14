package pl.sda.arp4.objects.zadanieDomowe.Bilet;

import java.util.Scanner;

public class ZadanieBiletEnumRozwiniety {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RodzajBiletu rodzaj = null;

        do {
            /*
           System.out.print("Podaj rodzaj biletu (dostepne rodzaje:" + Arrays.toString(RodzajBiletu.values())+ "):");
            */
            System.out.print("Podaj rodzaj biletu (dostepne rodzaje:");
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

        }while (rodzaj ==null);

        System.out.println("Podaj ilość biletów ktore chcesz kupic:");
        int iloscBiletow = scanner.nextInt();
        System.out.println("Cena biletow to:" + (iloscBiletow* rodzaj.getCena()));

    }
}
