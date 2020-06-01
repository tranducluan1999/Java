package classofficials;

public class Officials {
    private String name;
    private float age;
    private String sex;
    private String add;

    public Officials() {
    }

    public Officials(String name, float age, String sex, String add) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.add = add;
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
}
