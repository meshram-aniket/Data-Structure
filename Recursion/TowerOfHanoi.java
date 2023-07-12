package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Hanoi(3, "A", "C", "B");
    }

    public static void Hanoi(int n, String from_rod, String to_rod, String aux_rod) {
        if (n == 0) {
//            System.out.println("transfer desk "+ n + " from "+ source + " to " + destination);
            return;
        }

        Hanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("move disk " +n+ " from rod " + from_rod + " to rod " + to_rod);
        Hanoi(n-1, aux_rod, to_rod, from_rod);
    }
}
