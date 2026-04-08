package t07_Operacje_na_zmiennych.e2;

public class Main {
    static void main(String[] args) {
        var netto = Math.random()*100;
        var vat = netto * 0.23;
        var brutto = netto + vat;
        System.out.println("Netto: " + String.format("%.2f", netto) + " VAT: " + String.format("%.2f", vat) + " Brutto: " + String.format("%.2f", brutto));
    }
}
