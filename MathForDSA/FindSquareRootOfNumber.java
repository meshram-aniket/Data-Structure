package MathForDSA;

public class FindSquareRootOfNumber {
    public static void main(String[] args) {
        int num = 40;
        int p = 3;
        System.out.println(squaraRoot(num,p));
    }

    public static double squaraRoot(int num, int p) {
        int s = 0;
        int e = num;

        double root = 0.0;
        while(s < e) {
            int m = s + (e - s)/ 2;
            if (m * m == num) {
                root = m;
                return root;
            }

            else if (m * m > num){
                e = m - 1;
            }

            else {
                s = m + 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += incr;
            }
            root-=incr;
            incr/=10;

        }

        return root;
    }
}
