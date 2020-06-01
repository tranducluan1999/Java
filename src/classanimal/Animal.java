package classanimal;


public class Animal {
    private String name;
    private String spiece;
    private float age;
    private String food;

    public Animal() {
    }

    public Animal(String name, String spiece, float age, String food) {
        this.name = name;
        this.spiece = spiece;
        this.age = age;
        this.food = food;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpiece() {
        return spiece;
    }

    public void setSpiece(String spiece) {
        this.spiece = spiece;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", spiece='" + spiece + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                '}';
    }
}
