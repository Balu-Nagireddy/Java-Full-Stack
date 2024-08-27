package sets;
import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> employeeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salaryComparison = Double.compare(e2.getSal(), e1.getSal());
                if (salaryComparison != 0) {
                    return salaryComparison;
                }
                return Integer.compare(e1.getEmpId(), e2.getEmpId());
            }
        });
        Employee e1 = new Employee(23, "smith", 4000);
        Employee e2 = new Employee(10, "martin", 5000);
        Employee e3 = new Employee(40, "allen", 8000);
        Employee e4 = new Employee(21, "scott", 1000);
        Employee e5 = new Employee(23, "smith", 4000);

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
        System.out.println("Displaying the Object from the TreeSet:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}

