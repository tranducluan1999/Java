package classofficials;

public class Worker extends Officials{
    private int level;

    public Worker(String name, float age, String sex, String add) {
        super(name, age, sex, add);
    }

    public Worker(String name, float age, String sex, String add, int level) {
        super(name, age, sex, add);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
