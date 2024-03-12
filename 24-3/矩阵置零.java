class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> hang=new ArrayList<>();
        ArrayList<Integer> lie =new ArrayList<>();
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                if (matrix[i][j]==0){
                 hang.add(i);
                 lie.add(j);
                }
            }
        }
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                if (hang.contains(i)||lie.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}