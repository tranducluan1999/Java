package storemanagementsystem;

public class FulltimeEmployee extends Emmployee{

    @Override
    public long getMealAllowance() {
        return 2000000;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }
    int totalWorkingDays;
    long dailySalary;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNunber);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public long getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(long dailySalary) {
        this.dailySalary = dailySalary;
    }
}
