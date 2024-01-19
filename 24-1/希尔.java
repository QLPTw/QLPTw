public class XiEr {
    public void XiErSort(int[] arrs) {
        for (int i = arrs.length / 2; i > 0; i / = 2) {
            for (int k = arrs.length - 1; k > 0; k--) {
                int j = k;
                int temp = arrs
                while (j - i >= 0 && temp < arrs[j - i]) {
                    arrs[j] = arrs[j - i];
                    j -= i;
                }
                arrs[j] = temp;
            }
        }
    }
}