package t17_Tablice_wielowymiarowe.e1;

public class Main {
    static void main() {
        double[][] tab = {
                {1.0, 1.5, 2.0},
                {1.5, 2.0, 2.5},
                {2.0, 2.5, 3.0}
        };
        System.out.println("Suma iloczynów przekątnych = " + (tab[0][0] * tab[1][1] * tab[2][2] + tab[0][2] * tab[1][1] * tab[2][0]));
        System.out.println("Iloczyn sum środkowego wiersza i kolumny = " + (tab[0][1] + tab[1][1] + tab[2][1]) * (tab[1][0] + tab[1][1] + tab[1][2]));
        System.out.println("Suma elementów przy krawędziach = " + (tab[0][0] + tab[0][1] + tab[0][2] + tab[1][2] + tab[2][2] + tab[2][1] + tab[2][0] + tab[1][0]));

    }
}
