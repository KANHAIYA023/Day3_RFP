package Com.Day3_RFP;
import java.util.Scanner;
public class UC2 {
    public static void main(String[] args) {
        //calculate daily employee wage
        Scanner sc = new Scanner(System.in);
        int perHourSalary = 20;
        System.out.print("Working hours is: ");
        int workingHours = sc.nextInt();

        int employeeWage = perHourSalary * workingHours;

        System.out.println("calculate the employee wage is: " + employeeWage);
    }

}
