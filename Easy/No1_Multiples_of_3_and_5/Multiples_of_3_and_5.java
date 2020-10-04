package Easy.No1_Multiples_of_3_and_5;
import java.math.BigInteger;

class Multiples_of_3_and_5 {
    public static void multiplesOfThreeAndFive(int n) {
        System.out.println((sum(n,3).add(sum(n,5)).subtract(sum(n,15))));
    }

    public static BigInteger sum(int n, int div) {
        BigInteger numCount = BigInteger.valueOf((n-1) / div);
        BigInteger pairSum = numCount.multiply(BigInteger.valueOf(div)).add(BigInteger.valueOf(div));

        return numCount.multiply(pairSum).divide(BigInteger.valueOf(2));
    }
}