import java.util.*;

/*
 * public class Interval {
 *   int start;
 *   int end;
 *   public Interval(int start, int end) {
 *     this.start = start;
 *     this.end = end;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param intervals Interval类ArrayList
     * @return Interval类ArrayList
     */
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        // 遍历
        int pre = 0, cur = 1;
        if (intervals.size() <= 1)  return intervals;
        int size = intervals.size();
        while (cur < size) {
            if (intervals.get(cur).start <= intervals.get(pre).end) {
                // 合并
                int end = Math.max(intervals.get(cur).end, intervals.get(pre).end);
                intervals.set(pre, new Interval(intervals.get(pre).start, end));
                intervals.remove(cur);
                size--;
            } else {
                pre++;
                cur++;
            }
        }
        return intervals;
    }
}