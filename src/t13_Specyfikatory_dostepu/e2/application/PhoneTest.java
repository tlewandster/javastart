package t13_Specyfikatory_dostepu.e2.application;

import t13_Specyfikatory_dostepu.e2.logic.Charger;
import t13_Specyfikatory_dostepu.e2.model.Telephone;

class PhoneTest {
    static void main() {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        System.out.println(telephone.info());
        for (int i = 0; i < 5; i++) {
            Charger.charge(telephone);
        }
        System.out.println(telephone.info());
    }
}
