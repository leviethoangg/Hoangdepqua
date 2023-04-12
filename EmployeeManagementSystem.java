import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagementSystem {
    static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n******* Welcome to the Employee Management System *******");
            System.out.println("1. Add Employee to the Database");
            System.out.println("2. Search for Employee");
            System.out.println("3. Edit Employee Details");
            System.out.println("4. Delete Employee Details");
            System.out.println("5. Display All Employees Working in this Company");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    searchEmployee();
                    break;
                case 3:
                    editEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    displayAllEmployees();
                    break;
                case 6:
                    System.out.println("Thank you for using the Employee Management System!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    public static void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the employee's job description: ");
        String jobDescription = sc.nextLine();
        System.out.print("Enter the employee's contact number: ");
        String contact = sc.nextLine();
        System.out.print("Enter the employee's email address: ");
        String email = sc.nextLine();
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        Employee newEmployee = new Employee(name, jobDescription, contact, email, salary);
        employees.add(newEmployee);
        System.out.println("Employee added successfully.");
    }

    public static void searchEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee you want to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Employee e : employees) {
            if (e.name.equalsIgnoreCase(name)) {
                System.out.println("Employee found: " + e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public static void editEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee you want to edit: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Employee e : employees) {
            if (e.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new salary: ");
                double newSalary = sc.nextDouble();
                e.salary = newSalary;
                System.out.println("Employee details updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public static void deleteEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee you want to delete: ");
        String name = sc.nextLine();
        boolean found = false;
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee e = itr.next();
            if (e.name.equalsIgnoreCase(name)) {
                itr.remove();
                System.out.println("Employee details deleted successfully.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public static void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }
}
