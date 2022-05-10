package pl.sda.arp4.objects;

public class Obywatel {

    private String Imie;
    private int pesel;

    public String getImie() {
        return Imie;
    }

    public int getPesel() {
        return pesel;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "Imie='" + Imie + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
