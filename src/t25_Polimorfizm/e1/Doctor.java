package t25_Polimorfizm.e1;

class Doctor extends Person {

    private int bonus;

    Doctor(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    int getBonus() {
        return bonus;
    }

    void setBonus(int bonus) {
        this.bonus = bonus;
    }

    String getInfo() {
        return super.getInfo() + ", Premia: " + bonus;
    }
}
