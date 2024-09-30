package Task.ex_25092024;

import java.util.Scanner;

public class PrimeNumberUsingForLoop {
    public static void main(String[] args) {
        int num=100, res;
        for (int i=1;i<=num;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean Prime(int num){
        boolean isPrime=true;
        if (num<=1){
            isPrime=false;
        }
        for (int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
