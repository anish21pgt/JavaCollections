import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeTreeSet {
    private TreeSet<Employee> employeeTreeSet;

    public EmployeeTreeSet() {
        employeeTreeSet = new TreeSet<>(Comparator.comparingInt(Employee::getSickLeaves));
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeTreeSet.add(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeTreeSet.isEmpty()) {
            System.out.println("Employee TreeSet is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = employeeTreeSet.first();

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using TreeSet");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}

