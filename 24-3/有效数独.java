import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        return Heng(board) && GeZi(board);
    }

    // 行和列
    public boolean Heng(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> res = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (res.contains(board[i][j]))
                    return false;
                res.add(board[i][j]);
            }
            res = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                if (res.contains(board[j][i]))
                    return false;
                res.add(board[j][i]);
            }
        }
        return true;
    }

    // 九宫格
    public boolean GeZi(char[][] board) {
        for (int n = 0; n < 9; n += 3) {
            for (int m = 0; m < 9; m += 3) {
                HashSet<Character> res = new HashSet<>();
                for (int i = n; i < n + 3; i++) {
                    for (int j = m; j < m + 3; j++) {
                        if (board[i][j] == '.')
                            continue;
                        if (res.contains(board[i][j]))
                            return false;
                        res.add(board[i][j]);
                    }
                }
            }
        }
        return true;
    }
}
