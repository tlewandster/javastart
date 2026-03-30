package t13_Specyfikatory_dostepu.e2.logic;

import t13_Specyfikatory_dostepu.e2.model.Telephone;

public class Charger {
    public static void charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
        System.out.println("Ładowanie..." + telephone.getChargeLevel() + "%");
    }
}
