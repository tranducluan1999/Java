package storemanagementsystem;

public abstract class Emmployee {

    private String name;
    private int age;
    private String identificationNunber;

    public Emmployee() {
    }

    public Emmployee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }

    public abstract long getMealAllowance();
    public abstract long getSalaryRate();
    public abstract int getWorkingCount();
    public long calculateSalary(long salary)
    {
        salary = getSalaryRate() * getWorkingCount() + getMealAllowance();
        return salary;

    }
}
