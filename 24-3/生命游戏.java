class Solution {
    public void gameOfLife(int[][] board) {
        int m= board.length;
        int n=board[0].length;
        int[][] res= new int[m][n];
        for (int i = 0; i < m; i++) {
            res[i]=Arrays.copyOf(board[i],n);
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                int num=0;
                if(i-1>=0&&res[i-1][j]==1)//上
                    num++;
                if(j-1>=0&&res[i][j-1]==1)//左
                    num++;
                if(i+1<m&&res[i+1][j]==1)//下
                    num++;
                if(j+1<n&&res[i][j+1]==1)//右
                    num++;
                if(i-1>=0&&j-1>=0&&res[i-1][j-1]==1)//左上
                    num++;
                if(i+1<m&&j+1<n&&res[i+1][j+1]==1)//右下
                    num++;
                if(i-1>=0&&j+1<n&&res[i-1][j+1]==1)//左下
                    num++;
                if(i+1<m&&j-1>=0&&res[i+1][j-1]==1)//右上
                    num++;
                if(num<2){
                    board[i][j]=0;
                } else if (num==3) {
                    board[i][j]=1;
                }else if (num>3){
                    board[i][j]=0;
                }
            }
        }
    }
}