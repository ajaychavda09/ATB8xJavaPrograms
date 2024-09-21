package Task.ex_20092024;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int score = scanner.nextInt();
        char grade = 'F';

        if(score>=90 && score<=100){
            grade = 'A';
        }
        else if(score<=89 && score>=80){
            grade = 'B';
        }
        else if (score<=79 && score>=70) {
            grade = 'C';
        }
        else if(score<=69 && score>=60){
            grade = 'D';
        }
        else {
            grade='F';
        }

        System.out.println("Grade == "+grade);

    }
}
