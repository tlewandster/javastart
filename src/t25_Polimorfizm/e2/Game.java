package t25_Polimorfizm.e2;

public class Game {

    static void main(String[] args) {
        Soldier soldier = new Attacker("John", 100, 50, 100, 0.10);
        Soldier soldier2 = new Defender("Jane", 100, 50, 100, 0.10);
        Soldier soldier3 = new Attacker("Bob", 90, 55, 100, 0.0);
        Soldier soldier4 = new Defender("Alice", 90, 55, 100, 0.0);
        Soldier soldier5 = new Attacker("Tom", 80, 60, 100, 0.010);
        Soldier soldier6 = new Defender("Jerry", 80, 60, 100, 0.010);

        Garrison biali = new Garrison("Biali", new Soldier[]{soldier, soldier2, soldier3});
        Garrison czarni = new Garrison("Czarni", new Soldier[]{soldier4, soldier5, soldier6});

        while (biali.getEnergyTotal() > 0 && czarni.getEnergyTotal() > 0) {
            biali.attack(czarni);
            czarni.attack(biali);
        }
        System.out.println("Koniec walki! Biali " + biali.getEnergyTotal() + " pkt. energii, Czarni " + czarni.getEnergyTotal() + " pkt. energii.");
    }
}
