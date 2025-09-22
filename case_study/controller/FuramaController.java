package case_study.controller;

import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    private final Scanner sc = new Scanner(System.in);

    // Service chỉ cho Employee
    private final IEmployeeService employeeService = new EmployeeService();

    public void displayMainMenu() {
        while (true) {
            System.out.println("======= FURAMA RESORT MANAGEMENT =======");
            System.out.println("1. Employee Management");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": employeeMenu(); break;
                case "2":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("❌ Invalid choice, please try again!");
            }
        }
    }

    private void employeeMenu() {
        while (true) {
            System.out.println("---- Employee Management ----");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Back to main menu");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();
            switch (choice) {
                case "1": employeeService.display(); break;
                case "2": employeeService.add(); break;
                case "3": employeeService.edit(); break;
                case "4": employeeService.delete(); break;
                case "5": return;
                default: System.out.println("❌ Invalid choice!");
            }
        }
    }
}
