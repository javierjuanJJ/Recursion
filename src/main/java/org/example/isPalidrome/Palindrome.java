package org.example.isPalidrome;

public class Palindrome {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindromeString("Alola");
        System.out.println(isPalindrome);
        isPalindrome = isPalindromeString("alola");
        System.out.println(isPalindrome);
    }

    private static boolean isPalindromeString(String alola) {
        int lenghtInput = alola.length();

        if (lenghtInput == 0 || lenghtInput == 1) {
            return true;
        }

        if (alola.charAt(0) == alola.charAt(lenghtInput - 1)){
            return isPalindromeString(alola.substring(1, lenghtInput - 1));
        }


        return false;
    }
}
