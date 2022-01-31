package mainOOP;

class Manager extends BaseEmployee{
    private static final int DEFAULT_BONUS=500;
    private int bonus;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, 5000, yearOfEmployment);
            this.bonus = DEFAULT_BONUS;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return 0;
    }
}
