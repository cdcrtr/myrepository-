package homework_nr_10;

import java.util.function.Predicate;

public class Employee {
    String name;
    String surname;
    int age;
    String department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }
    public static void main(String[] args) {
        //7.
        Employee employee1= new Employee("John","Bush", 20,"Software Engineering");
        Employee employee2= new Employee("Anna","Romanova", 35,"Product Management");
        //7.
        Predicate <Employee> employeeWorksInSoftEngDepartment = (Employee e)-> e.department.equals("Software Engineering");
        //8.
        System.out.println("Test if employee works in the software engineering department ------>");
        System.out.println(testEmployee(employee1, employeeWorksInSoftEngDepartment));
        //7.
        Predicate <Employee> employeeIsOlderThan20Yrs = (Employee e) -> e.age > 20 ;
        //8.
        System.out.println("Test if employee is over 20 years old --------------------------->");
        System.out.println(testEmployee(employee2, employeeIsOlderThan20Yrs));
        //7.
        Predicate <Employee> employeesNameStartsWithA = (Employee e)-> e.name.startsWith("A");
        //8.
        System.out.println("Test if employees name starts with A ----------------------------->");
        System.out.println(testEmployee(employee2,employeesNameStartsWithA));
    }

    public static boolean testEmployee(Employee e, Predicate<Employee> testMethod){

        if (testMethod.test(e)==true) {
            return true;
        } else {
            return false;
        }
    }
}
