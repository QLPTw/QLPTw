public class Solution {
    /**
     * 递归函数，用于查找从(i, j)出发能够走的最长路径长度
     *
     * @param matrix 原始矩阵
     * @param i      当前节点的行坐标
     * @param j      当前节点的列坐标
     * @param sum    当前已经走过的路径长度
     * @param copy   标记数组，用于标记已经走过的节点
     * @return 最长路径长度
     */
    public int recursion(int[][] matrix, int i, int j, int sum, int[][] copy) {
        int n = matrix.length;
        int temp;
        if (i >= 0 && j >= 0 && i <= n - 1 && j <= n - 1 && copy[i][j] != 1) {
            sum++; 
        } else {
            return sum; 
        }
        if (j > 0 && matrix[i][j - 1] > matrix[i][j]) {
            copy[i][j] = 1; 
            temp = recursion(matrix, i, j - 1, sum,copy);
            copy[i][j] = 0; 
            if (temp > sum) {
                sum = temp; 
            }
        }
        if (i > 0 && matrix[i - 1][j] > matrix[i][j]) {
            copy[i][j] = 1;
            temp = recursion(matrix, i - 1, j, sum, copy);
            copy[i][j] = 0;
            if (temp > sum) {
                sum = temp;
            }
        }
        if (i < n - 1 && matrix[i + 1][j] > matrix[i][j]) {
            copy[i][j] = 1;
            temp = recursion(matrix, i + 1, j, sum, copy);
            copy[i][j] = 0;
            if (temp > sum) {
                sum = temp;
            }
        }
        if (j < n - 1 && matrix[i][j + 1] > matrix[i][j]) {
            copy[i][j] = 1;
            temp = recursion(matrix, i, j + 1, sum, copy);
            copy[i][j] = 0;
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum; 
    }


    public int solve(int[][] matrix) {
        int sum = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return sum;
        }
        int n = matrix.length;
        int[][] copy = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = 0; // 初始化标记数组
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = recursion(matrix, i, j, 0,
                                     copy); 

                if (temp > sum) {
                    sum = temp; // 更新最长路径长度
                }
            }
        }
        return sum;
    }
}
