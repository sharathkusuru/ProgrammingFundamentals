package fundamentals;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number is :");
        a =sc.nextInt();
        System.out.println("enter second number :");
        b=sc.nextInt();
        int  c = a-b;
        System.out.println("subtraction of two numbers is :"+c);

    }
}
