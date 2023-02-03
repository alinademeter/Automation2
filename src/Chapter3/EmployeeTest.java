package Chapter3;

public class EmployeeTest {
    public static void main(String [] args){
        Employee employee1 = new Employee( "Alina", "Test", 3000);
        Employee employee2 = new Employee("Victor","Test", 500);

        System.out.printf("%s %s salary: $%.2f%n", employee1.getFirstName(),employee1.getLastName(),
              employee1.getMonthlySalary());
        System.out.printf("%s %s salary: $%.2f%n", employee2.getFirstName(),employee2.getLastName(),
                employee2.getMonthlySalary());
    }//done
}
