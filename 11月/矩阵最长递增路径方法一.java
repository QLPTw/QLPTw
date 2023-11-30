public class Solution {
    /**
     * 递归函数，用于查找从(i, j)出发能够走的最长路径长度
     *
     * @param matrix 原始矩阵
     * @param i      当前节点的行坐标
     * @param j      当前节点的列坐标
     * @param prev   上一个节点的值
     * @param copy   标记数组，用于标记已经走过的节点
     * @return 当前节点的路径长度
     */
    public int recursion(int[][] matrix, int i, int j, int prev, int[][] copy) {
        int n = matrix.length;
        if (i < 0 || j < 0 || i >= n || j >= n || copy[i][j] != 0 || matrix[i][j] <= prev) {
            return 0;
        }
        
        copy[i][j] = 1; // 标记当前节点已经遍历过
        
        int left = recursion(matrix, i, j - 1, matrix[i][j], copy);
        int right = recursion(matrix, i, j + 1, matrix[i][j], copy);
        int up = recursion(matrix, i - 1, j, matrix[i][j], copy);
        int down = recursion(matrix, i + 1, j, matrix[i][j], copy);
        
        int max = Math.max(left, Math.max(right, Math.max(up, down)));
        
        copy[i][j] = 0; // 恢复标记
        
        return max + 1;
    }

    public int solve(int[][] matrix) {
        int maxLen = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxLen;
        }
        
        int n = matrix.length;
        int[][] copy = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int len = recursion(matrix, i, j, matrix[i][j]-1, copy);
                maxLen = Math.max(maxLen, len);
            }
        }
        
        return maxLen;
    }
}
