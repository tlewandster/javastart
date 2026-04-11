package t11_Przeciążanie_metod_i_this.e2;

public class Dice {

    int result;

    Dice() {
        roll();
    }

    Dice(int result) {
        this.result = result;
    }

    void roll() {
        this.result = (int) (Math.random() * 6) + 1;
    }

    void printResult() {
        System.out.println("Liczba oczek na kostce: " + this.result);
    }
}
