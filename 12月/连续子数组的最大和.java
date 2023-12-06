import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型
     */
    public int FindGreatestSumOfSubArray (int[] array) {
        // write code here
        if(array.length==0){
            return 0;
        }
        int res=array[0];
        int[] dp=new int[array.length+1];
        for(int i=0;i<array.length;i++){
            dp[i]=array[i];
        }
        for(int i=1;i<array.length;i++){
            int temp=dp[i];
            dp[i]=Math.max(dp[i],dp[i]+dp[i-1]);
            if(dp[i]>res){
                res=dp[i];
            }
        }
        return res;
    }
}