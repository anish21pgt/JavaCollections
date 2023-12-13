import java.util.HashSet;

public class EmployeeHashSet {
    private HashSet<Employee> employeeHashSet;

    public EmployeeHashSet() {
        employeeHashSet = new HashSet<>();
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeHashSet.add(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeHashSet.isEmpty()) {
            System.out.println("Employee HashSet is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = null;
        for (Employee employee : employeeHashSet) {
            if (employeeWithLowestSickLeaves == null || employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                employeeWithLowestSickLeaves = employee;
            }
        }

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using HashSet");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}
