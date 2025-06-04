import java.time.LocalDate;

class Person {
    String name;
    int age;
    LocalDate dob;

    public Person(String name, String dob, int age) {
        this.name = name;
        this.age = age;
        this.dob = LocalDate.parse(dob);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }
}

class Employee extends Person {
    String empId;
    double salary;  // fixed typo here

    public Employee(String name, String dob, int age, String empId, double salary) {
        super(name, dob, age);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayInfo(); // Display inherited Person details
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Arun", "2005-09-27", 20, "E123", 75000);
        emp.displayEmployeeDetails();
    }
}
