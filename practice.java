public class practice {

    public static void main(String[] args) {
        practice p = new practice();
        int num = 5;
        int a = 0;
        int b = 1;
        System.out.print("0 1 ");
        fib(num, a, b);
       

    }

    public static void fib(int num, int start, int end) {
        if (num == 0) {
            return;
        }
            int sum = start + end;
            System.out.print(sum + " ");
            fib(num - 1, end, sum);

    }



}
