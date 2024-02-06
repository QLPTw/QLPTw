class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if ((numbers[right] + numbers[left]) > target) {
                right--;
            } else if ((numbers[right] + numbers[left]) < target) {
                left++;
            } else if ((numbers[right] + numbers[left]) == target) {
                res[0] = left+1;
                res[1] = right+1;
                break;
            }
        }
        return res;
    }
}