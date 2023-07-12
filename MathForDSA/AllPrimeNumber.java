package MathForDSA;


public class AllPrimeNumber {
    public static void main(String[] args) {
        int num = 40;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }

    }


    // false  in array means number is prime
   public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
   }
}