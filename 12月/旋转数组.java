import java.util.*;


public class Solution {
    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
        // write code here
        m = m % n;

        if (1 == n || 0 == m) {
            return a;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < (n - m); i++) {
            queue.add(a[i]);
        }   
        for (int i = 0; i < m; i++) {
            a[i] = a[i + (n - m)];
        }
        int index = m;
        while (!queue.isEmpty()) {
            a[index] = queue.poll();
            index++;
        }
        return a;
    }
}
