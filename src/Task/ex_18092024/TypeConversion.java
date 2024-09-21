package Task.ex_18092024;

public class TypeConversion {
    public static void main(String[] args) {
        byte i=100;
        int l=i; // widening implicit
        float f=(float) i; // widening explicit
        System.out.println("byte value = "+i);
        System.out.println("Integer value = "+l);
        System.out.println("Float value = "+f);

        //Narrowing
        int a=89;
        //byte b =a; implicit narrowing throwing error as it is not possible
        byte b= (byte) a;
        System.out.println("Integer value = "+a);
        System.out.println("Byte value = "+b);
    }
}
