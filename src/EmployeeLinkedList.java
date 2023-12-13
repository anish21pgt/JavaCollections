import java.util.LinkedList;

public class EmployeeLinkedList {
    private LinkedList<Employee> employeeList;

    public EmployeeLinkedList() {
        employeeList = new LinkedList<>();
    }

    public void addEmployee(String name, int id, int sickLeaves) {
        Employee employee = new Employee(name, id, sickLeaves);
        employeeList.add(employee);
    }

    public void calculateAndPrintBonus() {
        if (employeeList.isEmpty()) {
            System.out.println("Employee list is empty.");
            return;
        }

        Employee employeeWithLowestSickLeaves = employeeList.getFirst();
        for (Employee employee : employeeList) {
            if (employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                employeeWithLowestSickLeaves = employee;
            }
        }

        double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
        System.out.println("Using Linked List");
        System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
        System.out.println("Bonus (10% of salary): Rs." + bonus);
    }
}
