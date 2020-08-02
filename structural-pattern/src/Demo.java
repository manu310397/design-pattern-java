import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Employee> employees = new EmployeeClient().getEmployeesList();

        System.out.println(employees);
    }
}
