package pl.sda.arp4.objects.zadanieDomowe.Bilet;

public enum RodzajBiletu {
    NORMALNY_GODZINA(0.3),
    ULGOWY_STUDENCKI(1.7),
    NORMLANY_CALODNIOWY(0.9),
    ULGOWY_EMERYT(5.3);

    private double cena;

    RodzajBiletu(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }
}
