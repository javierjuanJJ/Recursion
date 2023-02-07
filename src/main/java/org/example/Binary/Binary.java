package org.example.Binary;

public class Binary {
    public static void main(String[] args) {
        String binaryFromDecimal = findBinary(125, "");
        System.out.println(binaryFromDecimal);
    }

    private static String findBinary(int number, String result) {

        if (number == 0){
            return result;
        }
        result += number % 2;
        return findBinary(number / 2,result);

    }
}
