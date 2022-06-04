package com.archanajl.codewars.paginatingbook;

public class BookNum {

    // Math.pow gives a double value.
    // Hence written a simple method to calculate the power
    public static long power(long x, long y)
    {
        long temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);

        if (y % 2 == 0)
            return temp * temp;
        else {
            if (y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
    }
    public static long pageDigits(long pages) {
        long numDigits = Long.toString(pages).length();

        long rTotal = 0;
        for (long i = 0; i < numDigits - 1 ; i++) {
            rTotal = rTotal + (9 * power(10,i) * (i+1));
        }
        rTotal += (pages - (power(10, numDigits-1) -1)) * numDigits;
        return rTotal;
    }

}
