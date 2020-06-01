package congnhan;

public class CongNhan {

    private String name;
    private float age;
    private String sex;
    private String add;
    private int level;

    public CongNhan() {
    }

    public CongNhan(String name, float age, String sex, String add, int level) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.add = add;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", add='" + add + '\'' +
                ", level=" + level +
                '}';
    }

    public void print()
    {
        System.out.println(" name: " +this.name);
        System.out.println(" age: " +  this.add);
        System.out.println(" sex: " + this.sex);
        System.out.println(" address: " +  this.add);
        System.out.println(" level: " + this.level);

    }
}
