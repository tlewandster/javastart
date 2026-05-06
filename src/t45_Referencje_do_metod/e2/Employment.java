package t45_Referencje_do_metod.e2;

enum Employment {
    FULL_TIME, PART_TIME, CONTRACT;

    boolean checkEmployeeEmployment(Employee employee) {
        return this == employee.getEmployment();
    }
}


