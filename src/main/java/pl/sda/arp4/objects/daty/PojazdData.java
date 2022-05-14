package pl.sda.arp4.objects.daty;

import java.time.LocalDateTime;

public class PojazdData {

    private String numerRejestracyjny;
    private RodzajPojazduData rodzajPojazdu;

    private LocalDateTime czasWjazdu;

    private LocalDateTime czasWyjazdu;
    public PojazdData(String numerRejestracyjny, RodzajPojazduData rodzajPojazdu ) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.rodzajPojazdu = rodzajPojazdu;
        this.czasWjazdu = LocalDateTime.now();
        System.out.println( "Pojazd wjechal na autostrade o: " +czasWjazdu );

    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public RodzajPojazduData getRodzajPojazdu() {
        return rodzajPojazdu;
    }

    public void setRodzajPojazdu(RodzajPojazduData rodzajPojazdu) {
        this.rodzajPojazdu = rodzajPojazdu;
    }
}
