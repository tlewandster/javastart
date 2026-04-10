package t26_Typ_wyliczeniowy_Enum.e1;

public enum Pizza {

    MARGHERITA(true,true,false,false),
    CAPRICIOSA(true,true,true,false),
    PROSCIUTTO(true,true,false,true);

    private final boolean hasTomatoSauce;
    private final boolean hasCheese;
    private final boolean hasMushroom;
    private final boolean hasHam;

    Pizza(boolean hasTomatoSauce, boolean hasCheese, boolean hasMushroom, boolean hasHam) {
        this.hasTomatoSauce = hasTomatoSauce;
        this.hasCheese = hasCheese;
        this.hasMushroom = hasMushroom;
        this.hasHam = hasHam;
    }

    public String toString() {
        String description = "Pizza z ";
        if (hasTomatoSauce) description += "sosem pomidorowym";
        if (hasCheese) description += ", serem";
        if (hasMushroom) description += ", pieczarkami";
        if (hasHam) description += ", szynką";
        return description;
    }

    public static String menu() {
        String menu = "";
        for (Pizza pizza : Pizza.values()) {
            menu += pizza.ordinal() + ". " + pizza.name() + " - " + pizza + "\n";
        }
        return menu;
    }
}
