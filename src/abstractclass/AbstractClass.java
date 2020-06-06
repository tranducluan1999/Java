package abstractclass;

public class AbstractClass {
    private  String name;
    private String mssv;
    private float gpa;

    public AbstractClass() {
    }

    public AbstractClass(String name, String mssv,float gpa) {
        this.name = name;
        this.mssv = mssv;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    boolean checkGpa()
    {
        if(this.gpa > 1.5)
        {
            return true;
        }
        else
            return false;
    }
     
}
