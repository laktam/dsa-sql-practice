class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while(r < matrix.length && c >= 0){
            if(target == matrix[r][c]) return true;
            else if(matrix[r][c] > target){
                c--;
            }else if(matrix[r][c] < target){
                r++;
            }
        }
        return false;
    }
}