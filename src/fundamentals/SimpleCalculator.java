package fundamentals;

import java.util.Scanner;

public class SimpleCalculator {
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
        int d = a+b;
        System.out.println("addition of two numbers is :"+d);
        if (a > b) {
            c =  a - b;
        } else {
            c =  a + b;
        }
        System.out.println("The difference between " + a + " and " + b  + " is " + c);
        int product = a *b;
        System.out.println("Product of the given two numbers is: " +product);
        int average = d/2;
        System.out.println("Average of two numbers is :" +average);
        int distance =Math.abs(a - b);
        System.out.println("distance between the two numbers :" +distance);
        int maximum = Math.max(a ,b);
        System.out.println("The maximum number is :"+maximum);
        int minimum = Math.min(a ,b);
        System.out.println("The minimum number is :"+minimum);

    }
}
