public class demo17 {
    class Solution {
        public int candy(int[] ratings) {
            int n = ratings.length;
            int[] ars = new int[n];
            ars[0] = 1;
            for (int i = 1; i < n; i++) {
                if (ratings[i] < ratings[i - 1]) {
                    ars[i] = 1;
                    for (int j = i - 1; j >= 0 && ratings[j] > ratings[j + 1] && ars[j] <= ars[j + 1]; j--) {
                        ars[j] = ars[j + 1] + 1;
                    }
                } else if (ratings[i] > ratings[i - 1]) {
                    ars[i] = ars[i - 1] + 1;
                } else {
                    ars[i] = 1;
                }

            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += ars[i];
            }
            return res;
        }
    }
}
