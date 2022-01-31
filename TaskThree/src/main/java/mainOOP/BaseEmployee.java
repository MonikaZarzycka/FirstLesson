package mainOOP;

abstract class BaseEmployee {

    private  String name;
    private String surname;
    protected int baseSalary;
    private int yearOfEmployment;

    public BaseEmployee(String name, String surname, int baseSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();
}
