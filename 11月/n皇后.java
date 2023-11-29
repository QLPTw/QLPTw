import java.util.*;

public class Solution {
    public int recursion(Integer[][] chessboard, int row, int count, HashSet<Integer[][]> set) {
        int n = chessboard.length;
        if (row == n && !set.contains(chessboard)) {
            set.add(copyOf(chessboard));
            return count + 1;
        } else {
            for (int col = 0; col < n; col++) {
                if (isValid(chessboard, row, col)) {
                    chessboard[row][col] = 1;
                    count = recursion(chessboard, row + 1, count, set);
                    chessboard[row][col] = 0;
                }
            }
            return count;
        }
    }

    public int Nqueen(int n) {
        Integer[][] chessboard = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessboard[i][j] = 0;
            }
        }
        HashSet<Integer[][]> set = new HashSet<>();
        int count = recursion(chessboard, 0, 0, set);
        return count;
    }

    public boolean isValid(Integer[][] chessboard, int row, int col) {
        int n = chessboard.length;

        // 检查同一列是否有皇后
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 1) {
                return false;
            }
        }

        // 检查左上至右下对角线是否有皇后
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        // 检查右上至左下对角线是否有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public Integer[][] copyOf(Integer[][] chessboard) {
        int n = chessboard.length;
        Integer[][] copy = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            copy[i] = Arrays.copyOf(chessboard[i], n);
        }
        return copy;
    }
}
