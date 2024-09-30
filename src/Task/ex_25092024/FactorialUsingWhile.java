package Task.ex_25092024;

import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        int num,fact=1,i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of which you want to calculate factorial");
        num=scanner.nextInt();
        while (i<=num){
            fact *= i;
            i++;
        }
        System.out.println("Factorial is = "+fact);
    }
}
