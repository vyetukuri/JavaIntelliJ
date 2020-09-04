package com.venkat.examples;

public class ForLoopExample{


    public void PrintStars(int n)
    {
        for (int i=0; i<n; i++) //outer loop for number of rows(n)
        {
            for (int j=n-i; j>1; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int k=0; k<=i; k++ ) //inner loop for number of columns
            {
                System.out.print(" * "); //print star
            }
        System.out.println(); //ending line after each row
        }
    }
}
