package Task.ex_25092024;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print table = ");
        num=scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
