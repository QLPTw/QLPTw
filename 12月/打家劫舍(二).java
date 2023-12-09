import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型
     */
    public int rob (int[] nums) {
        // write code here
        int[] dp1 = new int[nums.length + 1];
        int[] dp2 = new int[nums.length + 1];
        dp1[1] = nums[0];
        int temp;
        for (int i = 2; i < nums.length; i++) {
            dp1[i] = Math.max(dp1[i - 1], nums[i - 1] + dp1[i - 2]);
        }
        temp = dp1[nums.length - 1];
        dp2[2] = nums[1];
        for (int i = 3; i <= nums.length; i++) {
            dp2[i]=Math.max(dp2[i-1],nums[i-1]+dp2[i-2]);
        }
        return Math.max(dp1[nums.length-1],dp2[nums.length]);
    }
}