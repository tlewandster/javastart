package t32_Operacje_na_plikach.e2;

class Client {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String country;
    private final double value;

    public Client(String id, String firstName, String lastName, String country, String value) {
        this.id = Integer.parseInt(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.value = Double.parseDouble(value);
    }

    public double getValue() {
        return value;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName + ", " + country + ", " + value + "zł";
    }
}
