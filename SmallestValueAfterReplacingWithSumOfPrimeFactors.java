import java.util.Scanner;

public class SmallestValueAfterReplacingWithSumOfPrimeFactors {
        public static  int smallestValue(int n) {
            if(isPrime(n)) return n; // otherwise it will run forever
            int sum = getPrimeFactorSum(n);
            if(sum == n) return n;  // otherwise it will run forever
            return smallestValue(sum);
        }

        public static boolean isPrime(int n) { // to check if number is prime
            if(n == 2) return true;
            for(int i = 2; i < Math.sqrt(n) + 1; i++) {
                if(n % i == 0) return false;
            }
            return true;
        }

        public static int getFirstPrimeFactor(int n) { // to get first prime number
            if(isPrime(n)) return n;
            for(int i = 2; i < n; i++) {
                if(n % i == 0) return i;
            }
            return n;
        }

        public static int getPrimeFactorSum(int n) { //sum of prime factors of a number
            int sum = 0;
            while(!isPrime(n)) {
                int m = getFirstPrimeFactor(n);
                n /= m;
                sum += m;
            }
            sum += n;
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(smallestValue(n));
    }
}
