import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param mat int整型二维数组 
     * @param n int整型 
     * @return int整型二维数组
     */
    public int[][] rotateMatrix (int[][] mat, int n) {
        // write code here
        if(mat.length==0){
            return mat;
        }
        int len=mat[0].length;
        int[][] res=new int[len][n];
        for(int i=0;i<len;i++){
            for(int j=n-1;j>=0;j--){
                res[i][n-j-1]=mat[j][i];
            }
        }
        return res;
    }
}