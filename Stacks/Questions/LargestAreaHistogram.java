package Stacks.Questions;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        LargestAreaHistogram l = new LargestAreaHistogram();
//        System.out.println(l.largestRectangleArea(height));
        System.out.println(l.largestRect(height));
    }



//    public int largestRectangleArea(int[] height) {
//        Stack<Integer> stack = new Stack<>();
//        int max = 0;
//
//
//        stack.push(0);
//        for (int i = 1; i < height.length; i++) {
//             while(!stack.isEmpty() && height[i] < height[stack.peek()]) {
//                max = getMax(height, stack, max, i);
//            }
//            stack.push(i);
//        }
//
//
//        int i = height.length;
//        while(!stack.isEmpty()) {
//            max = getMax(height, stack, max, i);
//        }
//        return max;
//    }
//
//
//
//    private static int getMax(int[] height, Stack<Integer> s, int max, int i){
//        int area;
//        int popped = s.pop();
//        if (s.isEmpty()) {
//            area = height[popped] * i;
//        }
//        else {
//            area = height[popped] * (i - 1 - s.peek());
//        }
//        return Math.max(max, area);
//    }




    public static int largestRect(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;


        stack.push(0);
        for (int i = 1; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] < height[stack.peek()]) {
                max = getIndex(height, stack, max, i);
            }
            stack.push(i);
        }


//        int i = height.length;
//        while(!stack.isEmpty()) {
//            max = getIndex(height, stack, max, i);
//        }

        return max;
    }


    private static int getIndex(int[] height, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();

        if (stack.isEmpty()) {
            area = height[popped] * i;
        }
        else {
            area = height[popped] * (i - 1 - height[stack.peek()]);
        }

        return Math.max(area, max);
    }
}
