import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型 
     * @return int整型
     */
    public int Fibonacci (int n) {
        // write code here
      if(n<=2){
        return 1;
      }
      ArrayList<Integer> list=new ArrayList();
      list.add(1);list.add(1);
      int sum;
      for(int i=2;i<n;i++){
        list.add(list.get(i-1)+list.get(i-2));
      }
      sum=list.get(n-1);
      return sum;
    }
}