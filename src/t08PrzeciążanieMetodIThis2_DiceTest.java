public class t08PrzeciążanieMetodIThis2_DiceTest {
    static void main(String[] args) {
        t08PrzeciążanieMetodIThis2_Dice dice1 = new t08PrzeciążanieMetodIThis2_Dice();
        dice1.printResult();
        dice1.roll();
        dice1.printResult();

        t08PrzeciążanieMetodIThis2_Dice dice2 = new t08PrzeciążanieMetodIThis2_Dice(6);
        dice2.printResult();
        dice2.roll();
        dice2.printResult();
    }
}
