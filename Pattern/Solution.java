package Pattern;

public class Solution {

    /*
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *

     */

//    public static void main(String[] args) {
//        int m = 4;
//        int n = 6;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }



    /*
     ******
     *    *
     *    *
     ******
     */

//    public static void main(String[] args) {
//        int m = 4;
//        int n = 6;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == 0 || i == m-1 || j == 0 || j == n-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//    }


    /*

     *
     * *
     * * *
     * * * *

     */

//    public static void main(String[] args) {
//        int m = 4;
//        int n = 4;
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }
//    }

    /*
     * * * *
     * * *
     * *
     *

     */

//    public static void main(String[] args) {
//        int m = 4;
//        int n = 4;
//        for (int i = 0; i < m ; i++) {
//            for (int j = 0; j < n-i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//
//        }
//    }

    /*

           *
         * *
       * * *
     * * * *


     */
//    public static void main(String[] args) {
//        int m = 4;
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print(" ");
//            }
//
//
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//    }



    /*
           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
     */

//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }


    /*

         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
     */


//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= m+1-i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }


    /*

           1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15
     */

//    public static void main(String[] args) {
//        int m = 5;
//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print((sum+=1) +" ");
//            }
//
//            System.out.println();
//        }
//    }


        /*
                1
                0 1
                1 0 1
                0 1 0 1
                1 0 1 0 1

         */

//    public static void main(String[] args) {
//        int m = 5;
//
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                int sum = i + j;
//                if (sum % 2==0 ) {
//                    System.out.print(1+" ");
//                }
//                else {
//                    System.out.print(0+" ");
//                }
//            }
//
//            System.out.println();
//        }
//    }



    /*

     *      *
     **    **
     ***  ***
     ********
     ********
     ***  ***
     **    **
     *      *

     */

//    public static void main(String[] args) {
//        int m = 4;
//
////           first half
//        for (int i = 1; i <= m; i++) {
////            print first star
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//
////            print spaces
//            int spaces = 2*(m-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
////            print remaining star
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
////        print another half
//        for (int i = m; i >= 1; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//
//            int spaces = 2*(m-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }



    /*
             * * * * *
           * * * * *
         * * * * *
       * * * * *
     * * * * *

     */


//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//            int spaces = m-i;
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" "+" ");
//            }
//
//            for (int j = 1; j <= m; j++) {
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//    }

    /*

               1
              2 2
             3 3 3
            4 4 4 4
           5 5 5 5 5

     */
//
//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//
//            int space = m - i;
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//        }
//    }



    /*

                   1
                  212
                 32123
                4321234
               543212345
     */

//    public static void main(String[] args) {
//        int m = 5;
//
//        for (int i = 1; i <= m; i++) {
//
//            //spaces
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print(" ");
//            }
//
//            // 1st half number
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//
//
//            // second half number
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }



    /*
             *
           * * *
         * * * * *
         * * * * *
           * * *
             *
     */

//    public static void main(String[] args) {
//        int m = 3;
//
////        first half
//        for (int i = 1; i <= m ; i++) {
////            print spaces
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print(" "+" ");
//            }
//
////            print star
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//
//            for (int j = 2; j <= i ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//
////        second half
//        for (int i = m; i >= 1 ; i--) {
////            print spaces
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print(" "+" ");
//            }
//
////            print star
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//
//            for (int j = 2; j <= i ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }


    /*

              *         *
              **       **
              * *     * *
              *  *   *  *
              *   * *   *
              *   * *   *
              *  *   *  *
              * *     * *
              **       **
              *         *
     */


//    public static void main(String[] args) {
//        int m = 5;
//
////        first half
//        for (int i = 1; i <= m; i++) {
//
//            for (int j = 1; j <= i; j++) {
//                if (i == j || j == 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
////            print space
//            int space = 2* (m-i);
//            for (int j = 0; j <= space ; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                if (i == j || j == 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//
////        second half
//        for (int i = m; i >= 1; i--) {
//
//            for (int j = 1; j <= i; j++) {
//                if (i == j || j == 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//
////            print space
//            int space = 2* (m-i);
//            for (int j = 0; j <= space ; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                if (i == j || j == 1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }



    /*

              *****
             *   *
            *   *
           *   *
          *****
     */

//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//
////            space
//            for (int j = 1; j <= m-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == m || j == m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }
//    }



    /*

            11111
            2222
            333
            44
            5
     */

//    public static void main(String[] args) {
//        int n = 5;
//        int sum = 1;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(sum);
//            }
//            sum += 1;
//            System.out.println();
//        }
//    }



    /*

                     1
                    1 2
                   1 2 3
                  1 2 3 4
                 1 2 3 4 5

     */

//    public static void main(String[] args) {
//        int m = 5;
//        for (int i = 1; i <= m; i++) {
//
//            int space = m - i;
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }
//    }


}

