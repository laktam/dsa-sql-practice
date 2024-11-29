class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean skip[][] = new boolean [rows][cols];
        for(int i = 0; i < rows; i++){
            Arrays.fill(skip[i], false);
        }
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(matrix[r][c] == 0 && !skip[r][c]){
                    set0s(matrix, skip, r, c);
                }
            }
        }
    }

    private void set0s(int matrix[][],boolean skip[][], int r, int c){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < cols; i++){
            if(matrix[r][i] != 0){
                skip[r][i] = true;
            } 
            matrix[r][i] = 0;
        }
        for(int i = 0; i < rows; i++){
            if(matrix[i][c] != 0){
                skip[i][c] = true;
            }
            matrix[i][c] = 0;
        }
    }
}