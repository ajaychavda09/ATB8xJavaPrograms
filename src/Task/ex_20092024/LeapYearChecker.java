package Task.ex_20092024;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        int year; boolean isLeap =false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        year = scanner.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeap = true;
                }
                else {
                    isLeap = false;
                }
            }
            else {
                isLeap = true;
            }
        }
        else {
            isLeap = false;
        }
        if(isLeap){
            System.out.println(year+" year is a leap year");
        }
        else {
            System.out.println(year+ " year is not a leap year");
        }
    }
}
