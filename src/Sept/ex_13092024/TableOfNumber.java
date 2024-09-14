package Sept.ex_13092024;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println();
            System.out.printf("%d * %d = %d",n,i,n*i);
        }
    }
}
