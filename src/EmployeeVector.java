import java.util.Vector;

public class EmployeeVector {
    private Vector<Employee> employeeVector;

    public EmployeeVector() {
        employeeVector = new Vector<>();
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeVector.add(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeVector.isEmpty()) {
            System.out.println("Employee vector is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = employeeVector.get(0);
        for (Employee employee : employeeVector) {
            if (employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                employeeWithLowestSickLeaves = employee;
            }
        }

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using Vector");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}
