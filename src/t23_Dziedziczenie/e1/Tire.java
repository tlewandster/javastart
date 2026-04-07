package t23_Dziedziczenie.e1;

class Tire extends Part {
    private int size;
    private double width;

    public Tire(int uin, String manufacturer, String model, int serialNumber, int size, double width) {
        setUin(uin);
        setManufacturer(manufacturer);
        setModel(model);
        setSerialNumber(serialNumber);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void printInfo() {
        System.out.println(getUin() + ", " + getManufacturer() + ", " + getModel() + ", " + getSerialNumber()
                + ", " + size + ", " + width);
    }
}