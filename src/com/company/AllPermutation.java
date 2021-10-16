package com.company;

import java.util.Scanner;

public class AllPermutation {

    static void permute(String a , String b)
    {
        if (a.length() == 0)
        {
            System.out.print(b + "  ");
            return;
        }

        for(int i = 0 ;i < a.length(); i++)
        {
            char ch = a.charAt(i);
            String left_substr = a.substring(0, i);
            String right_substr = a.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, b + ch);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String a;
        String b="";

        System.out.print("Enter the string : ");
        a = scan.next();

        System.out.print("\nAll possible strings are : ");
        permute(a, b);
    }
}
