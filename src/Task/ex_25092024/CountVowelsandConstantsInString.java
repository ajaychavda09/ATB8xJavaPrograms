package Task.ex_25092024;

import java.util.Scanner;

public class CountVowelsandConstantsInString {
    public static void main(String[] args) {
        String str; int vowels=0, constant=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to count Vowels and Constant");
        str = scanner.next();
        char str2[]= str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(str2[i]=='a' || str2[i]=='e' || str2[i]=='i' || str2[i]=='o' || str2[i]=='u'){
                vowels++;
            }
            else if (str2[i]=='A' || str2[i]=='E' || str2[i]=='I' || str2[i]=='O' || str2[i]=='U') {
                vowels++;
            } else {
                constant++;
            }
        }
        System.out.println("Vowels = "+vowels+" Constant = "+constant);

    }
}
