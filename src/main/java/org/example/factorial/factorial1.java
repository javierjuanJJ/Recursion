package org.example.factorial;

public class factorial1 {
    public static void main(String[] args) {
        System.out.println(factorial(12));
    }

    private static int factorial(int i) {
        if (i > 0){
            return i * factorial(i-1);
        }
        return 1;
    }
}
