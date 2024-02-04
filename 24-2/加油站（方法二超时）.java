public class demo15 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        for (int start = 0; start < n; start++) {
            if(gas[start]<cost[start]){
                continue;
            }
            int cur=gas[start]-cost[start];
            int idx=(start+1)%n;
            while (idx!=start){
                cur+=gas[idx]-cost[idx];
                if(cur<0){
                    break;
                }
                idx=(idx+1)%n;
            }
            if(idx==start){
                return start;
            }
        }
        return -1;
    }
}
