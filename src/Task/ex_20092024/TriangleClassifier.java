package Task.ex_20092024;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        int side1, side2, side3;
        String triangle="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Side-1 :");
        side1 = sc.nextInt();
        System.out.println("Enter Side-2 :");
        side2 = sc.nextInt();
        System.out.println("Enter Side-3 :");
        side3 = sc.nextInt();

        if((side1==side2 && side2 == side3)){
            triangle="Equilateral";
        }
        else if (side2==side3 || side1==side3 || side1==side2) {
            triangle="ISosceles";
        }
        else {
            triangle="Scalene";
        }

        System.out.println(triangle);
    }
}
