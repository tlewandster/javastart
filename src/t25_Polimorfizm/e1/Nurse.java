package t25_Polimorfizm.e1;

class Nurse extends Person {

    private int overtimeHours;

    Nurse(String firstName, String lastName, int salary, int overtimeHours) {
        super(firstName, lastName, salary);
        this.overtimeHours = overtimeHours;
    }

    int getOvertimeHours() {
        return overtimeHours;
    }

    void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtimeHours;
    }
}
