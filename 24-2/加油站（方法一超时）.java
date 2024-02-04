public class demo14 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        int len= gas.length;
        if (len != cost.length) {
            return res;
        }
        for (int i = 0; i < len; i++) {
            gas[i] -= cost[i];
        }

        for (int i = 0; i < len; i++) {
            if (gas[i] < 0) {
                continue;
            }
            int temp = gas[i];
            int j = i + 1;
            while (temp >= 0 && j%len!= i) {
                temp += gas[j%len];
                j++;
            }
            if (temp >= 0) {
                res = i;
            }
        }
        return res;
    }
}
