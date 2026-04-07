package t23_Dziedziczenie.e1;

public class ExhaustPart extends Part{
    private boolean isCompilanceWithStandard;

    public ExhaustPart(int uin, String manufacturer, String model, int serialNumber, boolean isCompilanceWithStandard) {
        this.isCompilanceWithStandard = isCompilanceWithStandard;
        setManufacturer(manufacturer);
        setModel(model);
        setSerialNumber(serialNumber);
        setUin(uin);
    }

    public boolean isCompilanceWithStandard() {
        return isCompilanceWithStandard;
    }

    public void setCompilanceWithStandard(boolean compilanceWithStandard) {
        isCompilanceWithStandard = compilanceWithStandard;
    }

    void printInfo() {
        System.out.println(getUin() + ", " + getManufacturer() + ", " + getModel() + ", " + getSerialNumber()
                + ", " + isCompilanceWithStandard);
    }
}
