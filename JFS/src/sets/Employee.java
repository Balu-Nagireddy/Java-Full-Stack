package sets;
import java.util.Objects;

public class Employee {
    private int empId;
    private String ename;
    private double sal;
    public Employee(int empId, String ename, double sal) {
        this.empId = empId;
        this.ename = ename;
        this.sal = sal;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    @Override
    public String toString() {
        return empId + ",\"" + ename + "\"," + sal;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                Double.compare(employee.sal, sal) == 0 &&
                Objects.equals(ename, employee.ename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, ename, sal);
    }
}
