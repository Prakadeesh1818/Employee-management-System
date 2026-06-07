package employee_management_system;

import java.util.Scanner;

public class Employee {

    int empId;
    String empName;
    double[] monthlySalary;

    public Employee(int empId, String empName,
                    double[] monthlySalary)
    {
        this.empId = empId;
        this.empName = empName;
        this.monthlySalary = monthlySalary;
    }

    public double calculateTotalSalary()
    {
        double total = 0;

        for(double salary : monthlySalary)
        {
            total += salary;
        }

        return total;
    }

    public double calculateAverageSalary()
    {
        return calculateTotalSalary() /
                monthlySalary.length;
    }

    public int countVowels()
    {
        int count = 0;

        String name = empName.toLowerCase();

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' ||
                    ch == 'u')
            {
                count++;
            }
        }

        return count;
    }

    public String reverseName()
    {
        String reversed = "";

        for(int i = empName.length() - 1;
            i >= 0;
            i--)
        {
            reversed += empName.charAt(i);
        }

        return reversed;
    }

    public void displayDetails()
    {
        System.out.println("\nEmployee ID : " +
                empId);

        System.out.println("Employee Name : " +
                empName);

        System.out.println("\nTotal Salary : " +
                calculateTotalSalary());

        System.out.println("Average Salary : " +
                calculateAverageSalary());

        System.out.println("\nNumber of Vowels : " +
                countVowels());

        System.out.println("\nReversed Name : " +
                reverseName());
    }
}
