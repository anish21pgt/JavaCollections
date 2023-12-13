public class Employee {
    private String name;
    private int id;
    private int sickLeaves;
    private double salary;

    public Employee(String name, int id, int sickLeaves) {
        this.name = name;
        this.id = id;
        this.sickLeaves = sickLeaves;
        this.salary = 50000.0;
    }

    public int getSickLeaves() {
        return sickLeaves;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sickLeaves=" + sickLeaves +
                ", salary=" + salary +
                '}';
    }
}
