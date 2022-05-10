package pl.sda.arp4.objects;

public class MainMis {
    public static void main(String[] args) {
        Mis mis1 = new Mis(10, "Koralgol");

        Mis mis2 = new Mis(15, "Uszatek");

        System.out.println(mis1);
        System.out.println(mis2);

        System.out.println("Byl sobie mis o imieniu " + mis1.getImie() + " ... ktory mial" + mis1.getWiek() + " ... lat");
        System.out.println("Byl sobie mis o imieniu " + mis2.getImie() + " ... ktory mial" + mis2.getWiek() + " ... lat");



    }
}
