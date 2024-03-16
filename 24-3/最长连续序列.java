class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                res[k] += 1;
            } else if (nums[i] != nums[i + 1]) {
                k += 1;
            }
        }
        Arrays.sort(res);
        return res[nums.length - 1]+1;
    }
}