package employee_management_system;

import java.util.Scanner;

public class EmployeeSalaryAnalysis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        double[] salaries = new double[3];

        System.out.println("Enter 3 Monthly Salaries:");

        for(int i = 0; i < 3; i++)
        {
            salaries[i] = sc.nextDouble();
        }

        Employee emp =
                new Employee(id, name, salaries);

        emp.displayDetails();

        sc.close();
    }
}