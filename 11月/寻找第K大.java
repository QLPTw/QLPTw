import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param a int整型一维数组
     * @param n int整型
     * @param K int整型
     * @return int整型
     */
    public int findKth (int[] a, int n, int K) {
        // write code here
        if (a.length == 0 || K > n) {
            return -1;
        }
        int temp;
        Stack<Integer> stack01 = new Stack();
        Stack<Integer> stack02 = new Stack();
        for (int i = 0; i < n; i++) {
            temp = a[i];
            while ((!stack01.isEmpty()) && temp < stack01.peek()) {
                stack02.add(stack01.pop());
            }
            stack01.add(temp);
            while (!stack02.isEmpty()) {
                stack01.add(stack02.pop());
            }
        }
        for (int i = 0; i < K; i++) {
            stack02.add(stack01.pop());
        }
        return stack02.pop();
    }
}