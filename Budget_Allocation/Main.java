package Projects.Budget_Allocation;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your budget: ");
        int budget = scan.nextInt();
        int sum = 0;
        int i =0;
        ArrayList<Integer> proportion = new ArrayList<Integer>();
        System.out.println("Enter your proportion of various expenses: ");
        System.out.println("!!The system stops if your cumulative proportion exceeds 100%!!!");
        do {
            
            System.out.println("Your proportion expense " + (i+1) + ":");
            int value = scan.nextInt();
            proportion.add(value);
            sum += proportion.get(i);
            i++;
        } while (sum <= 100);
        scan.close();
        if (sum > 100){
           int cumulativeSum = 0;
           for (int index = 0; index < proportion.size(); index++) {
            cumulativeSum += proportion.get(index);
           }
           proportion.set(proportion.size() - 1, 100 - cumulativeSum);
        }
        for (int value : proportion) {
            int expense = value * budget/100;
            System.out.println("Your " + value + "% equals $" + expense);
        }
    }
}
