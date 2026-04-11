package t10_Metody_i_konstruktory.e4;

public class Main {
    public static void main(String[] args) {

        House houseResource = new House(10000,1000);

        houseResource.printResourceInfo();
        houseResource.takeShower();
        houseResource.printResourceInfo();
        houseResource.watchTv(4);
        houseResource.printResourceInfo();
        houseResource.boilWater();
        houseResource.printResourceInfo();
    }
}
