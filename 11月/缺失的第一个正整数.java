import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组 
     * @return int整型
     */
    public int minNumberDisappeared (int[] nums) {
        // write code here
        int res=1;
        if(nums.length==0){
            return 1;
        }
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        while(set.contains(res)){
            res++;
        }
        return res;
    }
}