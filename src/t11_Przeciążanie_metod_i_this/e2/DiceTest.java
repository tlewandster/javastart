package t11_Przeciążanie_metod_i_this.e2;

public class DiceTest {
    static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.printResult();
        dice1.roll();
        dice1.printResult();

        Dice dice2 = new Dice(6);
        dice2.printResult();
        dice2.roll();
        dice2.printResult();
    }
}
