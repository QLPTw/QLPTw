import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] res=new int[0];
        HashMap<Integer,Integer> hash=new HashMap();
        for(int i=0;i<numbers.length;i++){
            int temp=target-numbers[i];
            if(!hash.containsKey(temp)){
                hash.put(numbers[i],i);
            }else{
                return new int[]{hash.get(temp)+1,i+1};
            }
        }
        return res;
    }
}