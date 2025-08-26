public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        Employee emp3 = new Employee("Charlie", 70000);

        // Create departments
        Department dept1 = new Department("HR");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Finance");

        // Add employees to departments
        dept1.add(emp1);
        dept2.add(emp2);
        dept3.add(emp3);

        // Create a top-level department
        Department headOffice = new Department("Head Office");
        headOffice.add(dept1);
        headOffice.add(dept2);
        headOffice.add(dept3);

        // Print total salary
        System.out.println("Total Salary: " + headOffice.getSalary());

        // Print organizational structure in XML
        System.out.println("Organizational Structure in XML:");
        System.out.println(headOffice.toXML(0));
    }
}