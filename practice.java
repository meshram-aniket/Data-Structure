public class practice {
    public static void main(String[] args) {
        int number = 1221;
        System.out.println(reverse(number));
        System.out.println(odd(7));
        System.out.println(isPalindrome(number));
        even(6);
        System.out.println(prime(6));
        System.out.println(isPrime(100));
        System.out.println(isPlain(12321));

    }

    static int sum = 0;
    public static int reverse(int num) {
        if (num == 0) {
            return 0;
        }
        int remainder = num % 10;
        sum = (sum * 10) + remainder;
        reverse(num / 10);
        return sum;
    }


    public static boolean isPalindrome(int num) {
        if (sum == num) {
            return true;
        }
        return false;
    }


    public static boolean odd(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void even(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static boolean prime(double num) {
        double sqr = Math.sqrt(num);
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < sqr; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrime(int num) {
        double sqr = Math.sqrt(num);
        for (int i = 2; i < sqr; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return false;
    }


    public static boolean isPlain(int num) {
        if (Reverse(num) == num) {
            return true;
        }
        return false;

    }

        static int Sum = 0;
    public static int Reverse(int num) {
        if (num == 0 ) {
            return 1;
        }
        int rem = num % 10;
        sum = (sum * 10) + rem;
        Reverse(num / 10);
        return Sum;
    }
}

