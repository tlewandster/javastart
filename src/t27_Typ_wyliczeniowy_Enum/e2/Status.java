package t27_Typ_wyliczeniowy_Enum.e2;

public enum Status {

    NEW("NOWE"),
    PAID("OPŁACONE"),
    SHIPPED("WYSŁANE"),
    DELIVERED("DOSTARCZONE"),
    CANCELLED("ANULOWANE");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }


}
