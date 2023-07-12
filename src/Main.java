import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int range = 20;
        for (int i = 1; i <= range; i++) {
            if(isPrimeUsingBigInteger(i)){
                System.out.println(i + " is prime");

            }else {
                System.out.println(i + " is not prime");
            }
        }
        }

    public static boolean isPrimeBruteForce(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++) {
            if(prime[p]) {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }

    public static boolean isPrimeUsingBigInteger(int n) {
        BigInteger bigInt = BigInteger.valueOf(n);
        return bigInt.isProbablePrime(100);
    }
}