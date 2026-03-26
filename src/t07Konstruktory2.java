public class t07Konstruktory2 {
    public static void main(String[] args) {

        t07Konstruktory2_House houseResource = new t07Konstruktory2_House(10000,1000);

        houseResource.printResourceInfo();
        houseResource.takeShower();
        houseResource.printResourceInfo();
        houseResource.watchTv(4);
        houseResource.printResourceInfo();
        houseResource.boilWater();
        houseResource.printResourceInfo();
    }
}
