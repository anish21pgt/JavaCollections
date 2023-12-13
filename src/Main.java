public class Main {
    public static void main(String[] args) {
        //Array List
        EmployeeArrayList employeeArrayList = new EmployeeArrayList();

        employeeArrayList.addEmployee("John Doe", 101, 5);
        employeeArrayList.addEmployee("Jane Smith", 102, 3);
        employeeArrayList.addEmployee("Bob Johnson", 103, 8);

        employeeArrayList.calculateAndPrintBonus();
        System.out.println();


        //Linked List
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        employeeLinkedList.addEmployee("John Doe", 101, 5);
        employeeLinkedList.addEmployee("Jane Smith", 102, 3);
        employeeLinkedList.addEmployee("Bob Johnson", 103, 8);

        employeeLinkedList.calculateAndPrintBonus();
        System.out.println();



        //Vector
        EmployeeVector employeeVector = new EmployeeVector();

        employeeVector.addEmployee("John Doe", 101, 5);
        employeeVector.addEmployee("Jane Smith", 102, 3);
        employeeVector.addEmployee("Bob Johnson", 103, 8);

        employeeVector.calculateAndPrintBonus();
        System.out.println();



        //Stack
        EmployeeStack employeeStack = new EmployeeStack();

        employeeStack.addEmployee("John Doe", 101, 5);
        employeeStack.addEmployee("Jane Smith", 102, 3);
        employeeStack.addEmployee("Bob Johnson", 103, 8);

        employeeStack.calculateAndPrintBonus();
        System.out.println();



        //TreeSet
        EmployeeTreeSet employeeTreeSet = new EmployeeTreeSet();

        employeeTreeSet.addEmployee("John Doe", 101, 5);
        employeeTreeSet.addEmployee("Jane Smith", 102, 3);
        employeeTreeSet.addEmployee("Bob Johnson", 103, 8);

        employeeTreeSet.calculateAndPrintBonus();
        System.out.println();



        //HashSet
        EmployeeHashSet employeeHashSet = new EmployeeHashSet();

        employeeHashSet.addEmployee("John Doe", 101, 5);
        employeeHashSet.addEmployee("Jane Smith", 102, 3);
        employeeHashSet.addEmployee("Bob Johnson", 103, 8);

        employeeHashSet.calculateAndPrintBonus();
        System.out.println();



        //TreeSet
        EmployeeLinkedHashSet employeeLinkedHashSet = new EmployeeLinkedHashSet();

        employeeLinkedHashSet.addEmployee("John Doe", 101, 5);
        employeeLinkedHashSet.addEmployee("Jane Smith", 102, 3);
        employeeLinkedHashSet.addEmployee("Bob Johnson", 103, 8);

        employeeLinkedHashSet.calculateAndPrintBonus();
        System.out.println();

    }
}

