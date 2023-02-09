package org.example.factorial;

public class factorial2 {
    public static void main(String[] args) {
        System.out.println(factorial(12));
    }

    private static int tailfactorial(int i, int multiplier) {
        if (i > 0){
            return tailfactorial(i -1, i * multiplier );
        }
        return multiplier;
    }

    private static int factorial(int i) {
        return tailfactorial(i,1);
    }
}
