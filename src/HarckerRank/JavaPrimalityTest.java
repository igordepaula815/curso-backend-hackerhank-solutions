package HarckerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    /*
     * A prime number is a natural number greater than whose only positive divisors
     * are and itself. For example, the first six prime numbers are 2,3,4,5,11 and 13.
     *
     * Given a large integer, , use the Java BigInteger class' isProbablePrime
     * method to determine and print whether it's prime or not prime.
     *
     * Input Format:
     * A single line containing an integer, (the number to be checked).
     *
     * Constraints:
     * contains at most digits.
     *
     * Output Format:
     * If is a prime number, print prime; otherwise, print not prime.
     *
     * Sample Input:
     * 13
     *
     * Sample Output:
     * prime
     */


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            BigInteger n = in.nextBigInteger();
            in.close();
            if (n.isProbablePrime(1)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
