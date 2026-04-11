package t10_Metody_i_konstruktory.e4;

public class House {

    double litersOfWater;
    double litersOfOil;

    public House(double litersOfWater, double litersOfOil) {
        this.litersOfWater = litersOfWater;
        this.litersOfOil = litersOfOil;
    }

    void takeShower() {
        this.litersOfWater -= 48;
        System.out.println("Bierzemy prysznic");
    }

    void takeBath() {
        this.litersOfWater -= 86;
        System.out.println("Bierzemy kąpiel");
    }

    void makeDinner() {
        this.litersOfWater -= 4;
        this.litersOfOil -= 0.1;
        System.out.println("Gotujemy obiad");
    }

    void boilWater() {
        this.litersOfWater -= 0.5;
        this.litersOfOil -= 0.05;
        System.out.println("Gotujemy wodę w czajniku");
    }

    void watchTv(int h) {
        this.litersOfOil -= h * 0.06;
        System.out.println("Przez " + h + " godziny oglądamy TV");
    }

    void printResourceInfo() {
        System.out.println("Ilość wody: " + this.litersOfWater);
        System.out.println("Ilość ropy: " + this.litersOfOil);
    }
}
