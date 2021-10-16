package com.company;
import java.util.*;
class AlgorithmUtility {
    public static void main(String[] args) {
        AlgorithmUtility utility = new AlgorithmUtility();
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number");

        int n = sc.nextInt();
        System.out.println("number: " + n);
        for (int i = 0; i <= 1000; i++) {
            if (AlgorithmUtility.isPrime(i)) {
                for (int j = i; j < 1000; j++) {
                    if (i != j) {
                        if (AlgorithmUtility.isPrime(j)) {
                            if (utility.isAnagram(String.valueOf(i), String.valueOf(j)) && utility.isPalindrome(i)) {
                                System.out.println(i + " " + j + " " + n + " is prime and anagram and palindrome");
                            }
                        }
                    }
                }

            }

        }

    }

    private boolean isPalindrome(int i) {
        return false;
    }

    private boolean isAnagram(String valueOf, String valueOf1) {
        return false;
    }

    private static boolean isPrime(int j) {
        return false;
    }

}