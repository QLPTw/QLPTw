import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param matrix int整型二维数组 
     * @return int整型ArrayList
     */
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length == 0) {
            return res;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while(left <= right && up <= down){
            for(int i = left; i <= right; i++)
                res.add(matrix[up][i]);
            up++;
            if(up > down)
                break;
            for(int i = up; i <= down; i++)
                res.add(matrix[i][right]);
            right--;
            if(left > right)
                break;
            for(int i = right; i >= left; i--)
                res.add(matrix[down][i]);
            down--;
            if(up > down)
                break;
            for(int i = down; i >= up; i--)
                res.add(matrix[i][left]);
            left++;
            if(left > right)
                break;
        }
        return res;
    }
}