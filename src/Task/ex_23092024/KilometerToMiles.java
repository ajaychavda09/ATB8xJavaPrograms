package Task.ex_23092024;

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        int choice;
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the conversion \n1.Kilometers to Miles \n2.Celsius to Fahrenheit");
        choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Kilometers = ");
                num=scanner.nextDouble();
                System.out.println("Conversion to miles = "+(num*0.62137119));
                break;
            case 2:
                System.out.println("Enter Celsius = ");
                num=scanner.nextDouble();
                System.out.println("Conversion to Fahrenheit = "+((num*9/5)+32)+"\u00B0"+"F");
                break;
            default:
                System.out.println("Please Choose proper option");
                break;
        }

    }
}
