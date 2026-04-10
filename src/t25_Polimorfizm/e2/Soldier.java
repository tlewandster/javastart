package t25_Polimorfizm.e2;

public class Soldier {

    private String name;
    private double attack;
    private double defense;
    private double energy;

    public Soldier(String name, double attack, double defense, double energy) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }


}
