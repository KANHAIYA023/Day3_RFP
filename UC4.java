package Com.Day3_RFP;
import java.util.Random;
public class UC4 {
    public static void main(String[] args) {
        //solving using switch case
        Random rd = new Random();
        int x = rd.nextInt(3);

        switch (x){
            case 0:
                System.out.println("employee is working full time:");
                break;
            case 1:
                System.out.println("employee is working part time:");
                break;
            case 2:
                System.out.println("employee is absent");
                break;
        }

    }
}
