package roar;

import java.math.BigInteger;
import java.util.Scanner;


public class ft {
    public static void main(String[] args) {
    var sc = new Scanner(System.in);
        System.out.print("Enter a Fibonacci index: ");
    long b = sc.nextLong();
        System.out.println(fibonacci(b));


    }
    public static BigInteger fibonacci(long n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j = 2 ; j <= n; j++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
}
