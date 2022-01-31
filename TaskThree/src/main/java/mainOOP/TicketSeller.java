package mainOOP;

class TicketSeller extends BaseEmployee{
    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname,3000, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return baseSalary;
    }
}
