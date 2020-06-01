package classstudent;

public class StudentManagement {
    private int totalstudent;
    private Student []students;

    public StudentManagement() {
    }

    public StudentManagement(Student[] students) {
        this.students = students;
        this.totalstudent = this.students.length;
    }

    public int getTotalstudent() {
        return totalstudent;
    }

    public void setTotalstudent(int totalstudent) {
        this.totalstudent = totalstudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int countStudentPass()
    {
        int a=0;
        for(int i=0;i<this.students.length;i++)
        {
            if(students[i].check() == true)
            {
                a++;


            }
            else
            {
                break;
            }

        }
        System.out.println(" The number of Student who passed was: " + a);
        return a;
    }
    public int countStudentFail()
    {
        int b=0;
        for(int i=0;i<this.students.length;i++)
        {
            if (students[i].check() == false )
            {
                b++;

            }
            else
            {
                break;
            }
        }
        System.out.println(" The number of student who failed was: " + b);
        return b;
    }
}
