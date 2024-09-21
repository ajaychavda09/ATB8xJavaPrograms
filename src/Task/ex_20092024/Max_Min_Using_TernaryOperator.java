package Task.ex_20092024;

public class Max_Min_Using_TernaryOperator {
    public static void main(String[] args) {
        int a=3, b=5 , c=7;
        int max = (a>b) ? (a>c ? a: c)  : (b>c ? b:c) ;
        System.out.println("Maximum is = "+max);
        int min = (a<b) ? (a<c ? a:c) : (b<c?b:c);
        System.out.println("Minimum is = "+min);
    }
}
