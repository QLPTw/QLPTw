import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] FindNumsAppearOnce(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (hash.get(num) == 1) {
                list.add(num);
                if (list.size() == 2) {
                    break;
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        if(result[0]>result[1]){
            int temp=result[0];
            result[0]=result[1];
            result[1]=temp;
        }
        return result;
    }
}
