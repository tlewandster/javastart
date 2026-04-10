package t25_Polimorfizm.e2;

public class Defender extends Soldier {

    private double bonus;

    public Defender(String name, int attack, int defense, int energy, double bonus) {
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
