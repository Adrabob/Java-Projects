package Projects.Vehicle_Insurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your vehicle type: ");
        System.out.println("car, truck, motorcycle, bus");
        String type = scan.nextLine();
        int premium = 0;
        switch (type) {
            case "car":
                premium = 200;
                break;
            case "truck":
                premium = 200;
                break;
            case "bus":
                premium = 200;
                break;
            case "motorcycle":
                System.out.println("Enter your motorcycle type: ");
                System.out.println("1 (low power), 2 (medium power), 3 (high power)");
                String motorcyclePowerType = scan.nextLine();
                int powerType = Integer.parseInt(motorcyclePowerType);
                switch (powerType) {
                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;                                        
                    default: 
                    System.out.println("Unknown Type");
                        break;
                }
                break;                                      
            default:
            System.out.println("Unknown Type");
                break;
        }
        System.out.println("This " + type + "'s premium is " + premium + "");
        scan.close();
    }
}
