package classstudent;

public class Student {
    private  String name;
    private float gpa;

    public Student() {
    }

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public boolean check()
    {
        if(this.gpa >= 1.5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  void printInfo()
    {
        System.out.println(" Name: " +  this.name +", "+ "Gpa: " +this.gpa);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

}
