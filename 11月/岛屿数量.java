import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 判断岛屿数量
     * @param grid char字符型二维数组
     * @return int整型
     */
    public void ResFind(char[][] grid, int level, int num, int[][] sum) {
        if (level < 0 || level == grid.length || num < 0 || num == grid[0].length ||
                grid[level][num] != '1' || sum[level][num] == 1) {
            return;
        } else {
            sum[level][num] = 1;
            ResFind(grid, level, num + 1, sum);
            ResFind(grid, level, num - 1, sum);
            ResFind(grid, level + 1, num, sum);
            ResFind(grid, level - 1, num, sum);
        }
    }
    public int solve (char[][] grid) {
        // write code here
        int res = 0;
        int[][] sum = new int[grid.length][grid[0].length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = 0;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && sum[i][j] == 0) {
                    ResFind(grid, i, j, sum);
                    res++;
                }
            }
        }
        return res;
    }
}