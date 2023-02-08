package org.example.Fibinacci;

public class Fibonnaci {
    public static void main(String[] args) {
        long fibonnaci1 = fibonnaci1(12);
        System.out.println(fibonnaci1);
    }

    private static long fibonnaci1(long number) {
        if (number == 0 || number == 1){
            return number;
        }
        else {
            return fibonnaci1(number - 1) + fibonnaci1(number - 2);
        }

    }
}
