public class demo16 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for (int i = 0; i < n; ) {
            if(gas[i]<cost[i]){
                i++;
            }else {
                int temp=gas[i]-cost[i];
                int j=i+1;
                while (j%n!=i){
                    temp+=gas[j%n]-cost[j%n];
                    if(temp<0){
                        break;
                    }
                    j++;
                }
                if(j%n==i){
                    return i;
                }else {
                    i=j;
                }
            }
            }
        return -1;
        }
}
