import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int[] dp=new int[prices.length+1];
        int res=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                dp[i]=Math.max(dp[i],prices[j]-prices[i]);
            }
            if(res<dp[i]){
                res=dp[i];
            }
        }
        return res;
    }
}