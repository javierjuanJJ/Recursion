package org.example.Fibinacci;

import java.util.HashMap;

public class Fibonnaci2 {

    static HashMap<Long, Long> memoryCache = new HashMap<>();

    public static void main(String[] args) {
        memoryCache.put(1L, 1L);
        memoryCache.put(0L, 1L);
        long fibonnaci1 = fibonnaci1(12);

        System.out.println(fibonnaci1);
    }

    private static long fibonnaci1(long number) {
        if (memoryCache.containsKey(number)){
            return memoryCache.get(number);
        }
        long result = fibonnaci1(number - 1) + fibonnaci1(number - 2);
        memoryCache.put(number,result);
        return result;
    }
}
