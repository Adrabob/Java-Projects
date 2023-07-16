package Projects.Grade_Point_Average_System;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> subject;
    private ArrayList<String> grade;

    public Student(String n){
        name = n;
        subject = new ArrayList<String>();
        grade = new ArrayList<String>();
    } 
    public String getName(){
        return name;
    }
    public void add(String s, String g){
        subject.add(s);
        grade.add(g);
    }
    public double getGPA(){
        double totalPoint = 0.0;
        for (String g : grade) {
            switch (g) {
                case "A":
                    totalPoint += 4;
                    break;
                case "B":
                    totalPoint += 3;
                    break;
                case "C":
                    totalPoint += 2;
                    break;    
                case "D":
                    totalPoint += 1;
                    break;
                case "F":
                    totalPoint += 0;
                    break;    
                default:
                    break;
            }
        }
        return totalPoint / grade.size();
    }

}
