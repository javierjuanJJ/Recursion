package org.example.inverseString;

public class InverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hellow World"));
    }

    private static String reverseString(String input) {
        if (input.equals("")){
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}
