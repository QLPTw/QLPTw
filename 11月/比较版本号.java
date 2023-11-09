import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 比较版本号
     * @param version1 string字符串
     * @param version2 string字符串
     * @return int整型
     */
    public int compare(String version1, String version2) {
        // write code here
        String s1[] = version1.split("\\.");
        String s2[] = version2.split("\\.");

        int n1 = s1.length;
        int n2 = s2.length;
        int n = Math.max(n1, n2);
        int k1[] = new int[n];
        for (int i = 0; i < s1.length; i++) {
            k1[i] = Integer.valueOf(s1[i]);
        }

        int k2[] = new int[n];
        for (int i = 0; i < s2.length; i++) {
            k2[i] = Integer.valueOf(s2[i]);
        }

        for (int i = 0; i < n; i++) {
            if (k1[i] > k2[i]) {
                return 1;
            } else if (k1[i] < k2[i]) {
                return -1;
            }
        }
        return 0;
    }
}