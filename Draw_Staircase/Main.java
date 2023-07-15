package Projects.Draw_Staircase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your stair width: ");
        int width = scan.nextInt();
        System.out.println("Enter your stair steps: ");
        int steps = scan.nextInt();
        for (int i = 0; i < steps; i++) {

            for (int j = 0; j < (i + 1) * width; j++) {
                System.out.print("*");
            }
            System.out.println("\r");

        }
        scan.close();
    }
}
