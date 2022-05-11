package pl.sda.arp4.objects.modele;

public class Obywatel {

    private String imie;
    private int pesel;

    public Obywatel(String imie, int pesel) {
        this.imie = imie;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "Imie='" + imie + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
