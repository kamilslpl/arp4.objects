package pl.sda.arp4.objects.daty;

public enum RodzajPojazduData {
    OSOBOWY (3.2),
    CIEZAROWY (5.9),
    JEDNOSLAD (1.1);

    private final double cena;

    public double getCena() {
        return cena;
    }
    RodzajPojazduData(double cena) {
        this.cena = cena;

    }

}
