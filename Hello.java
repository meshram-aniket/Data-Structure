import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        System.out.println(valid(height));
    }

    public static int valid(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;


        stack.push(0);
        for (int i = 0; i < height.length; i++) {
            while(!stack.isEmpty() && height[i] < height[stack.peek()]) {
                max = getIndex(max, stack, i, height);
            }
            stack.push(i);
        }

        int i = height.length;
        while(!stack.isEmpty()) {
            max = getIndex(max, stack, i, height);
        }

        return max;
    }


    private static int getIndex(int max, Stack<Integer> stack, int i, int[] height)  {
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

