import java.util.Stack;

public class EmployeeStack {
    private Stack<Employee> employeeStack;

    public EmployeeStack() {
        employeeStack = new Stack<>();
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeStack.push(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeStack.isEmpty()) {
            System.out.println("Employee stack is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = employeeStack.peek();
        for (Employee employee : employeeStack) {
            if (employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                employeeWithLowestSickLeaves = employee;
            }
        }

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using Stack");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}
