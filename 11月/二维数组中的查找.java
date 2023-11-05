import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param target int整型
     * @param array int整型二维数组
     * @return bool布尔型
     */
    public boolean Find (int target, int[][] array) {
        // write code here
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;
        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
