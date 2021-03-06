package mainOOP;

abstract class BaseEmployee {

    private  String name;
    private String surname;
    protected int baseSalary;
    private int yearOfEmployment;
    private static final int CURRENT_YEAR=2022;

    public BaseEmployee(String name, String surname, int baseSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = CURRENT_YEAR - yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();
}
