package org.example.sumNumNaturals;

public class SumNumNaturals {
    public static void main(String[] args) {
        System.out.println(sumNumNaturals(10));
    }

    private static int sumNumNaturals(int number) {
        if (number <= 1) {
            return number;
        }
        return number + sumNumNaturals(number - 1);
    }
}
