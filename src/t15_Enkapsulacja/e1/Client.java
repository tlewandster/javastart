package t15_Enkapsulacja.e1;

record Client(String firstName, String lastName, boolean premium) {

    public boolean hasFirstName() {
        return firstName != null && !firstName.isEmpty();
    }

    public boolean hasLastName() {
        return lastName != null && !lastName.isEmpty();
    }

}