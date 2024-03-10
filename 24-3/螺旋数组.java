class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length;
        int high = 0, low = matrix.length;
        while (left < right && high < low) {
            for (int i = left; i < right; i++) {
                list.add(matrix[high][i]);
            }
            high++;

            if (!(high < low))
                break;
            for (int i = high; i < low; i++) {
                list.add(matrix[i][right - 1]);
            }
            right--;

            if (!(left < right))
                break;
            for (int i = right - 1; i >= left; i--) {
                list.add(matrix[low - 1][i]);
            }
            low--;

            if (!(high < low))
                break;

            for (int i = low - 1; i >= high; i--) {

                list.add(matrix[i][left]);
            }
            left++;
        }

        return list;
    }
}