import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param input int整型一维数组
     * @param k int整型
     * @return int整型ArrayList
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || input.length < k || k <= 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack01 = new Stack<>();
        Stack<Integer> stack02 = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            int temp = input[i];
            while (!stack01.isEmpty() && temp >= stack01.peek()) {
                stack02.push(stack01.pop());
            }
            stack01.push(temp);
            while (!stack02.isEmpty()) {
                stack01.push(stack02.pop());
            }
        }
        for (int i = 0; i < k; i++) {
            result.add(stack01.pop());
        }
        return result;
    }
    }