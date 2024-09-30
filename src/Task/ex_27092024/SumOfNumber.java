package Task.ex_27092024;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        int start, end,i, sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        start=scanner.nextInt();
        System.out.println("Enter ending number");
        end=scanner.nextInt();
        i=start;
        while (i<=end){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of "+end +" number is = "+sum);
    }
}
