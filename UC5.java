package Com.Day3_RFP;
import java.util.Random;
public class UC5 {
    public static void main(String[] args) {
        //calculating employee wage for a month
        Random rd = new Random();

        int perHourSalary = 20;
        int workingHour = 0;
        int x = rd.nextInt(3);

        for (int day=1; day<=20; day++){
            if(x==1){
                workingHour=8;
                System.out.println("employee is present" + day * perHourSalary * workingHour);
                if (day==5){
                    break;
                }
            }
            else if (x==2){
                workingHour=4;
                System.out.println("employee is working part time " + day * perHourSalary * workingHour);
                if (day==5){
                    break;
                }
            }
            else {
                System.out.println("employee is absent");

            }
        }

    }
}
