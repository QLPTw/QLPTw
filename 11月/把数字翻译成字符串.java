import java.util.*;

public class Solution {
    public int solve (String nums) {
        int len = nums.length();
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums.charAt(0) == '0' ? 0 : 1;
        }

        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = nums.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= len; i++) {
            int oneDigit = Integer.parseInt(nums.substring(i - 1, i));
            int twoDigits = Integer.parseInt(nums.substring(i - 2, i));

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[len];
    }
}
