package mainOOP;

class TicketSeller extends BaseEmployee{

    private static final int DEFAULT_SALARY=3000;

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname,DEFAULT_SALARY, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }
}
