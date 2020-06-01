package classofficials;

public class Employees extends Officials{
    private String work;

    public Employees(String name, float age, String sex, String add) {
        super(name, age, sex, add);
    }

    public Employees(String name, float age, String sex, String add, String work) {
        super(name, age, sex, add);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "work='" + work + '\'' +
                '}';
    }
}
