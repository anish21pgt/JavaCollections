import java.util.ArrayList;

public class EmployeeArrayList {
        private ArrayList<Employee> employeeList;

        public EmployeeArrayList() {
                employeeList = new ArrayList<>();
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

                Employee employeeWithLowestSickLeaves = employeeList.get(0);
                for (Employee employee : employeeList) {
                        if (employee.getSickLeaves() < employeeWithLowestSickLeaves.getSickLeaves()) {
                                employeeWithLowestSickLeaves = employee;
                        }
                }

                double bonus = 0.1 * employeeWithLowestSickLeaves.getSalary();
                System.out.println("Using Array List");
                System.out.println("Employee with the lowest sick leaves: " + employeeWithLowestSickLeaves);
                System.out.println("Bonus (10% of salary): Rs." + bonus);
        }
}
