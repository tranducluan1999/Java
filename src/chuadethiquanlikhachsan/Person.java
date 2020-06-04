package chuadethiquanlikhachsan;

public class Person {
    private String name;
    private float age;
    private String datebirth;
    private int cmt;

    public Person() {
    }

    public Person(String name, float age, String datebirth, int cmt) {
        this.name = name;
        this.age = age;
        this.datebirth = datebirth;
        this.cmt = cmt;
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

    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String datebirth) {
        this.datebirth = datebirth;
    }

    public int getCmt() {
        return cmt;
    }

    public void setCmt(int cmt) {
        this.cmt = cmt;
    }
}
