public class practice {
    public static void main(String[] args) {
        int number = 1221;
        int[] array = {1,2,3,10,5,6,7};
        System.out.println(reverse(number));
        System.out.println(odd(7));
        System.out.println(isPalindrome(number));
        even(6);
        System.out.println(prime(6));
        System.out.println(isPrime(100));
        System.out.println(isPlain(12321));
        table(5);
        cube(4);
        System.out.println(array(array));
        System.out.println(minimum(array));
        fibona(0,1, 5);
        System.out.println(number(4));
        print(10);

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


    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }


    public static void cube(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }

    public static int array(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void fibona(int a, int b, int d) {
        if (d == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibona(b, c, d-1);
    }


    public static boolean number(int number) {
        if (number >= 0) {
            return true;
        }
        return false;
    }



    public static void print(int number) {
        for (int i = 0; i <= number ; i++) {
            System.out.print(i + " ");
        }
    }
}

