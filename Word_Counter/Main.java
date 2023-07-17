package Projects.Word_Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your paragraph:");
        String input = scan.nextLine();
        scan.close();
        input = input.trim();
        int count = 0;
        if (input.length() == 0){
            count = 0;
        }else{
            count++;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' ' && input.charAt(i + 1) != ' '){
                    count++;
                }
            }
        }
        System.out.println(count); 
    }
}
