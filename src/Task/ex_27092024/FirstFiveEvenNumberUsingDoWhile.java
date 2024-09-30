package Task.ex_27092024;

import java.util.Scanner;

public class FirstFiveEvenNumberUsingDoWhile {
    public static void main(String[] args) {
        int start, end, count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        start=scanner.nextInt();
        System.out.println("Enter ending number");
        end=scanner.nextInt();
        int i=start;
        do {
            if(i%2==0){
                count++;
                System.out.println("First five even numbers are: \n"+i);
                if(count==5){
                    break;
                }
            }
            i++;
        }while (i<=end);


    }
}
