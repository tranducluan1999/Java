package classofficials;

import java.util.Arrays;

public class EmployeesManagement {
    private int totalEmployess;
    private Employees []employees;

    public EmployeesManagement() {
    }

    public EmployeesManagement(Employees[] employees) {
        this.employees = employees;
        this.totalEmployess = this.employees.length;
    }

    public int getTotalEmployess() {
        return totalEmployess;
    }

    public void setTotalEmployess(int totalEmployess) {
        this.totalEmployess = totalEmployess;
    }

    public Employees[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employees[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeesManagement{" +
                "totalEmployess=" + totalEmployess +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

}
