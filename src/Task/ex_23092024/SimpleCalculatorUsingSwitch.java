package Task.ex_23092024;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        String operation;
        System.out.println("Enter First Number");
        num1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        num2 = scanner.nextInt();
        System.out.println("Enter Operation that you want to perform. \n Add,Sub,Mul,Div & Modulus");
        operation = scanner.next();

        switch (operation){
            case "Add":
                System.out.println("Addition is = "+(num1+num2));
                break;
            case "Sub":
                System.out.println("Subtraction is = "+(num1-num2));
                break;
            case "Mul":
                System.out.println("Multiplication is = "+(num1*num2));
                break;
            case "Div":
                System.out.println("Division is = "+(num1/num2));
                break;
            case "Modulus":
                System.out.println("Modulus is = "+(num1%num2));
                break;
            default:
                System.out.println("Please Enter Correct Operation");
                break;
        }

    }
}
