import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param height int整型一维数组
     * @return int整型
     */
    public int maxArea (int[] height) {
        // write code here
        int len = height.length;
        if (len < 2) {
            return 0;
        }
        int res = 0;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int temp = Math.min(height[left], height[right]);
            res = Math.max(res, temp * (right - left));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}