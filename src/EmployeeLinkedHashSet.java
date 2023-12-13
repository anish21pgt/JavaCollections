import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {
    private LinkedHashSet<Employee> employeeLinkedHashSet;

    public EmployeeLinkedHashSet() {
        employeeLinkedHashSet = new LinkedHashSet<>();
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeLinkedHashSet.add(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeLinkedHashSet.isEmpty()) {
            System.out.println("Employee LinkedHashSet is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = null;
        for (Employee employee : employeeLinkedHashSet) {
            if (employeeWithLowestSickLeaves == null || employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                employeeWithLowestSickLeaves = employee;
            }
        }

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using LinkedHashSet");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}
