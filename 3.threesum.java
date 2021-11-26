package com.company;
import java.util.Scanner;
public class threenumbers
{
    public static void main( String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three value to find the sum ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x + y + z;
        System.out.println("Sum is " + sum);
    }
}
