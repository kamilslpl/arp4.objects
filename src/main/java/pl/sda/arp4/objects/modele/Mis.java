package pl.sda.arp4.objects.modele;

public class Mis {

    int wiek;
    private String imie;

    public Mis(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Mis{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}
