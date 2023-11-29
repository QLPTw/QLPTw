import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param n int整型
     * @return string字符串ArrayList
     */
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> res=new ArrayList();
        if(n==0){
            return res;
        }
        recursion(0,0,"",res,n);
        return res;
    }
    public void recursion(int left, int right, String temp, ArrayList<String> res,
                          int n) {
        if(left==n&&right==n){
            res.add(temp);
        }else{
            if(left<n){
                recursion(left+1,right,temp+"(",res,n);
            }
            if(right<n&&left>right){
                recursion(left,right+1,temp+")",res,n);
            }
        }

    }
}