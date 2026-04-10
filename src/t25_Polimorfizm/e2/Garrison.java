package t25_Polimorfizm.e2;

public class Garrison {

    private String name;
    private Soldier[] soldiers;
    private double attackPower;
    private double defensivePower;
    private double energyTotal;

    public Garrison(String name, Soldier[] soldiers) {
        this.name = name;
        this.soldiers = soldiers;
        for (Soldier soldier : soldiers) {
            attackPower += (soldier instanceof Attacker) ? soldier.getAttack() * ((Attacker) soldier).getBonus() : soldier.getAttack();
            defensivePower += (soldier instanceof Defender) ? soldier.getDefense() * ((Defender) soldier).getBonus() : soldier.getDefense();
            energyTotal += soldier.getEnergy();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefensivePower() {
        return defensivePower;
    }

    public void setDefensivePower(double defensivePower) {
        this.defensivePower = defensivePower;
    }

    public double getEnergyTotal() {
        return energyTotal;
    }

    public void setEnergyTotal(double energyTotal) {
        this.energyTotal = energyTotal > 0 ? energyTotal : 0;
    }

    void attack(Garrison defenders) {
        double damage = getAttackPower() - defenders.getDefensivePower();
        if (damage > 0) {
            System.out.println(name + " atakują " + defenders.name + " i zadają " + damage + "pkt. obrażeń!");
            defenders.setEnergyTotal(defenders.getEnergyTotal() - damage);
        } else {
            System.out.println(name + " atakują " + defenders.name + " ale nie zadają żadnych obrażeń!");
        }
    }
}
