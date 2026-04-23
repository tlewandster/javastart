package t36_Operacje_na_tablicach.e1;

public class PersonDbTest {
    static void main() {
        PersonDatabase pdb = new PersonDatabase();

        pdb.add(new Person("Thomas", "Ens", "123456789"));
        pdb.add(new Person("Tarab", "O'Netto", "987654321"));
        pdb.add(new Person("Jan", "Kowalski", "123456789"));

        System.out.println(pdb);

        pdb.remove(new Person("Tarab", "O'Netto", "987654321"));

        System.out.println(pdb);
    }
}
