import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (num.length < 3) {
            return res;
        }

        Arrays.sort(num); // 先对数组进行排序

        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                continue; // 跳过重复的元素，避免得到重复的三元组
            }

            int left = i + 1, right = num.length - 1;
            while (left < right) {
                int sum = num[i] + num[left] + num[right];
                if (sum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);

                    // 跳过重复的元素
                    while (left < right && num[left] == num[left + 1]) {
                        left++;
                    }
                    while (left < right && num[right] == num[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
