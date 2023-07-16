package Projects.Grade_Point_Average_System;

public class Main {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.add("Mat", "A");
        jack.add("Tr", "C");
        jack.add("Eng", "B");
        jack.add("Fr", "D");
        System.out.println(jack.getName() + " has a GPA of " + jack.getGPA());
    }
}
