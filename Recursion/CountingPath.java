package Recursion;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class CountingPath {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path(3,3 , "");

        System.out.println(pathList(3,3, ""));
    }

    public static int count(int row, int col) {
       if (row == 1 || col == 1) {
           return 1;
       }
        int down = count(row-1, col);
        int right = count(row, col-1);
        int diagnol = count(row - 1, col - 1);
        return down + right + diagnol;

    }




    public static void path(int row, int col, String up) {
        if (row == 1 && col == 1) {
            System.out.println(up);
            return;
        }

        if (row > 1 && col > 1) {
            path(row-1, col-1, up+'D');
        }


        if (row > 1) {
            path(row-1, col, up+'V');
        }



        if (col > 1) {
            path(row, col-1, up+'H');
        }
    }

    public static ArrayList<String>  pathList(int row, int col, String up) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }


        ArrayList<String>ans = new ArrayList<>();
        if (row > 1 && col > 1) {
            ans.addAll(pathList(row-1, col-1, up+'D'));
        }


        if (row > 1) {
            ans.addAll(pathList(row - 1, col, up + 'V'));
        }


        if (col > 1) {
            ans.addAll(pathList(row, col - 1, up + 'H'));
        }
        return ans;
    }
}
