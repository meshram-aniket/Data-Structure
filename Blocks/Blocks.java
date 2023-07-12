package Blocks;

public class Blocks {

    public static void main(String[] args) {
        //method
        int a = 10;
        int b = 20;

        //blocks
        {
//            int a = 100;            //  we cannot initialised inside the blocks
            a = 120;                  // we can update inside the blocks
            System.out.println(a);    // we can use inside the blocks




            int c = 30;
            System.out.println(c);
        }

        System.out.println(a);


        int c = 40;                   //we can initialised outside the blocks
        System.out.println(c);
    }
}
