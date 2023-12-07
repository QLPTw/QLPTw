import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A string字符串
     * @return int整型
     */
    public int getLongestPalindrome (String A) {
        // write code here
        if (A.length() == 0) {
            return 0;
        }
        if (A.length() == 1) {
            return 1;
        }
        int[] dp = new int[A.length() + 1];
        Arrays.fill(dp, 1);
        int res = 0;
        for (int i = 1; i < A.length(); i++) {
            for (int j = 1; j <= i && j < A.length(); j++) {
                if(A.charAt(i-j)==A.charAt(i+j)){
                    dp[i]+=2;
                }else{
                    if(j==1&&(A.charAt(i-j)==A.charAt(i)||A.charAt(i+j)==A.charAt(i))){
                        dp[i]+=1;
                        break;
                    }
                }
            }
            if(res<dp[i]){
                res=dp[i];
            }
        }
        return res;
    }


}