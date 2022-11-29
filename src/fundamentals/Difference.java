package fundamentals;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number is :");
        a =sc.nextInt();
        System.out.println("enter second number :");
        b=sc.nextInt();
        if (a > b) {
            c =  a - b;
        } else {
          c =  a + b;
        }
        System.out.println("The difference between " + a + " and " + b  + " is " + c);

    }
}
