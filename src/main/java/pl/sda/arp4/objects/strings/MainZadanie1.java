package pl.sda.arp4.objects.strings;
/*
Zadeklaruj zmienną tekstową text i przypisz do niej jakąś wartość .
        sprawdź czy w tekście występuje słowo “ania” - contains
        sprawdź czy tekst zaczyna się od słowa “ania” - startsWith
        sprawdź czy tekst kończy się słowem “ania” - endsWith
        sprawdź czy tekst równa się słowu “ania” - equals
        sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
        zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf
*/

public class MainZadanie1 {
    public static void main(String[] args) {
String tekst = " ania Babajaga";

if (tekst.contains("ania")){
            System.out.println("tekst zawiera slowo");

        }else {
    System.out.println("Tekst nie zawiera slowa ania");
        }
        System.out.println("starts with " + tekst.startsWith("ania"));
        System.out.println("starts with " + tekst.equals("ania"));
        System.out.println("starts with " + tekst.toLowerCase().contains("ania"));

       /* sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania” - toLowerCase + contains
        zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście - indexOf
        */
        System.out.println("starts with " + tekst.indexOf("ania"));


    }
}
