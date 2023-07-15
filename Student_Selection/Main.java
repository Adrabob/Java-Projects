package Projects.Student_Selection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);        
        System.out.println("Enter number of students: ");
        int numOfStudents = scan.nextInt();
        String[] students = new String[numOfStudents];
        int[] age = new int[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter name: ");
            students[i] = scanName.nextLine();
            System.out.println("Enter age: ");
            age[i] = scanAge.nextInt();
        }
        for (int i = 0; i < numOfStudents; i++) {
            if (age[i] > 15){
            System.out.println(students[i] + " can receive a vaccine");
            System.out.println("The student is now " + age[i]);

            }
        }
        scan.close();
        scanName.close();
        scanAge.close();

    }
}
