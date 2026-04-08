package t25_Polimorfizm.e1;

class HospitalApp {
    static void main() {

        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Jan", "Kowalski", 5000, 1000));
        hospital.add(new Nurse("Anna", "Nowak", 4000, 20));
        hospital.add(new Nurse("Maria", "Kowalska", 3000, 15));

        hospital.getInfo();
    }
}
