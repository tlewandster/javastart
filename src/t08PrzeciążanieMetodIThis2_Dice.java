public class t08PrzeciążanieMetodIThis2_Dice {

    int result;

    t08PrzeciążanieMetodIThis2_Dice() {
        roll();
    }

    t08PrzeciążanieMetodIThis2_Dice(int result) {
        this.result = result;
    }

    void roll() {
        this.result = (int) (Math.random() * 6) + 1;
    }

    void printResult() {
        System.out.println("Liczba oczek na kostce: " + this.result);
    }
}
