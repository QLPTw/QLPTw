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
        int maxlen=1;
        for(int i=0;i<A.length()-1;i++){
            maxlen=Math.max(maxlen,Math.max(fun(A,i,i),fun(A,i,i+1)));
        }
        return maxlen;
    }

    public int fun(String s,int begein,int end){
        while(begein>=0&&end<s.length()&&s.charAt(begein)==s.charAt(end)){
            begein--;
            end++;
        }
        return end-begein-1;
    }
}