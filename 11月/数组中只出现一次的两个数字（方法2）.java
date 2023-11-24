import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param nums int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] nums) {
        // write code here
        if (nums.length == 0) {
            return new int[0];
        }
        ArrayList<Integer> list = new ArrayList();
        int[] res = new int[2];
        HashMap<Integer, Integer> hash = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!hash.containsKey(nums[i])) {
                hash.put(nums[i], 1);
            } else {
                hash.put(nums[i], hash.get(nums[i])+1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (hash.get(nums[i]) < 2) {
                list.add(nums[i]);
            }
            if (list.size() > 1) {
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        if(res[0]>res[1]){
            int temp=res[0];
            res[0]=res[1];
            res[1]=temp;
        }
        return res;
    }
}