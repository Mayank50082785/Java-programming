package com.company;
import java.util.Scanner;

//Add two numbers
//WAP to calculate sum of three number in java
//......................................................................................//

public class helloworld
{
    public static void main( String [] args)
    {
        Scanner sc = new Scanner (System.in );
        System.out.println("Enter the value of X and Y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum of "+x+"+"+y+"="+sum);
    }
}



