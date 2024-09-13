package JobsheetAssignment;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declaration scanner java

        System.out.println();
        System.out.println("----- INPUT HOURS WORKED & HOURLY WAGES -----");
        System.out.println("How many hours do you work in a month: ");
        double hoursWorked = sc.nextDouble(); // to read input hours worked from user
        System.out.println("How much do you get paid per hour? ");
        double hourlyWages = sc.nextDouble(); //to read input hourly wages from user
        System.out.println();

        double totalSalary = hoursWorked * hourlyWages; //calculation gross salary per month
        double bonus = totalSalary * 0.1; //calculation bonus
        double tax = (totalSalary + bonus) * 0.05; //calculation tax
        double monthlySalary = totalSalary + bonus - tax; //calculation monthly salary

        System.out.println("----- MONTHLY SALARY -----");
        //the result may be in scientific notation if it is more than 9.999.999 million
        System.out.println("Your monthly salary is: " + monthlySalary);
        //this is for the result without scientific notation even though the result
        //is more than 9.999.999 million
        System.out.printf("Your monthly salary is(not in scientific notation): %.0f%n", monthlySalary);
        System.out.println();
    }
}
