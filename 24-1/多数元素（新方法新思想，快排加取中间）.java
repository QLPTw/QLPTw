class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        quick_sort(nums, 0, len - 1, len/2);
        return nums[len / 2];
    }
    
    int quick_sort(int[] q, int l, int r, int k)
    {
        if (l >= r) return q[l];

        int i = l - 1, j = r + 1, x = q[(l + r) >> 1];
        while (i < j)
        {
            do i ++ ; while (q[i] < x);
            do j -- ; while (q[j] > x);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        if (j - l + 1 > k) return quick_sort(q, l, j, k);
        else return quick_sort(q, j + 1, r, k - (j - l + 1));
    }
}