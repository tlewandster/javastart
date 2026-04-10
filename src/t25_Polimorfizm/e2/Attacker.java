package t25_Polimorfizm.e2;

public class Attacker extends Soldier {

    private double bonus;

    public Attacker(String name, double attack, double defense, int energy, double bonus) {
        super(name, attack, defense, energy);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
