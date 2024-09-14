package Sept.ex_13092024;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a=sc.nextDouble();
        System.out.println("Enter second number:");
        double b =sc.nextDouble();
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a/b));
        System.out.println("Modulus = "+(a%b));
    }
}
