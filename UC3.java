package Com.Day3_RFP;
import java.util.Scanner;
public class UC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int perHourSalary = 20;
        System.out.print("working hours is: ");
        int hours = sc.nextInt();
        if (hours==8){
            System.out.println("working full time employee and salary is :" + perHourSalary*hours);
        }
        else if (hours==4){
            //partTime employee
                System.out.println("working part time employee and salary is :" + perHourSalary*hours);
            }
        else {
            System.out.println("Employee is absent");
        }


    }
}
