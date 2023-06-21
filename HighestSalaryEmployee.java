import java.util.Scanner;

class Employee {
    String name;
    double salary;
}

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        setData(employees);
        displayData(findEmployeeWithHighestSalary(employees));
    }

          public static void setData(Employee[] employees) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                Employee employee = new Employee();

                System.out.print("Enter name for employee " + (i + 1) + ": ");
                employee.name = scanner.nextLine();

                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                employee.salary = scanner.nextDouble();
                scanner.nextLine(); 

                employees[i] = employee;
            }
        }
    }

    public static Employee findEmployeeWithHighestSalary(Employee[] employees) {
        Employee highestSalaryEmployee = employees[0];

        for (int i = 1; i < 5; i++) {
            if (employees[i].salary > highestSalaryEmployee.salary) {
                highestSalaryEmployee = employees[i];
            }
        }

        return highestSalaryEmployee;
    }

    public static void displayData(Employee employee) {
        System.out.println("Employee with the highest salary:");
        System.out.println("Name: " + employee.name);
        System.out.println("Salary: " + employee.salary);
    }
}