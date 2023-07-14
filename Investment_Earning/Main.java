package Projects.Investment_Earning;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your buying price per share: ");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice;
        while(true){
            System.out.println("\nEnter your closing price for day " + day + ":");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) 
            break;
            double earning = closingPrice - buyingPrice;
            if (earning > 0){
                System.out.printf("After day %d you earned %.2f per share.", day, earning);
            }else if(earning < 0){
                System.out.printf("After day %d you lost %.2f per share.", day, earning);
            }else {
                System.out.printf("After day %d you have no earnings per share.", day);
            }
            day++;
        }

        scan.close();
    }
}