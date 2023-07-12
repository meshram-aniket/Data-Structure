package TypeCasting;

public class Casting {

    public static void main(String[] args) {

        //automatically casting
        int a = 342;
        float f = a;
        System.out.println(f+a);



        //manually casting
        float f1 = 523.25f;
        int i1 = (int)(f1);
        System.out.println(i1);


        // sum of char
        char c = 'A';
        char m = 'M';
        int s = (byte)(c+m);
        System.out.println(s);
    }
}
