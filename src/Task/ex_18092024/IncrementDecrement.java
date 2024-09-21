package Task.ex_18092024;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a=10;
        System.out.println(--a + a-- + a--); //9 + 9 + 8  = 26
        System.out.println(a);  // a=7

        int a2=10;
        System.out.println(--a2 + a2++ + a2--); // 9 + 9 + 10 = 28
        System.out.println(a2); // a = 9

        int a3=10;
        System.out.println(a3-- + a3-- + a3--); // 10 + 9 + 8 = 27
        System.out.println(a3);  // a = 7
    }
}

