package t24_Konstrukcja_super.e1;

public class Apple extends Fruit{
        private String variety;

    Apple(int weight, String variety) {
        super(weight, "Jabłko");
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return (super.getInfo() + ", Odmiana: " + variety);
    }
}
