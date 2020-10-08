package Easy.No2_Even_Fibonacci_Numbers;
import java.math.BigInteger;

class Even_Fibonacci_Numbers {
    public static void findFib(long n) {
        BigInteger prev = BigInteger.valueOf(0);
        BigInteger fib = BigInteger.valueOf(2);
        BigInteger sum = BigInteger.valueOf(0);
        while (fib.compareTo(BigInteger.valueOf(n)) < 0) {
            sum = sum.add(fib);
            BigInteger tmp = fib;
            fib = fib.multiply(BigInteger.valueOf(4)).add(prev);
            prev = tmp;
        } 
        System.out.println(sum);
    }
}