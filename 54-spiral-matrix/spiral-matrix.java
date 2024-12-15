class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int height = matrix.length - 1;
        int width = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int row = 0;
        int col = 0;
        // ether rigth bottom or left up
        boolean rightDown = true;
        while(result.size() < matrix.length * matrix[0].length){
            if(rightDown){
                // right
                for(int i = 0; i < width; i++){
                    result.add(matrix[row][col]);
                    col++;
                }
                col--;
                row++;
                width--;
                
                // down
                for(int i = 0; i < height; i++){
                    result.add(matrix[row][col]);
                    row++;
                }
                row--;
                col--;
                height--;
                rightDown = !rightDown;
            }
            else{
                // left
                
                for(int i = 0;i < width; i++){
                    result.add(matrix[row][col]);
                    col--;
                }
                col++; // to accomidate the last unecessary col--; in the loop
                row--; // start from one row up
                width--;

                // up
                for(int i = 0; i < height; i++){
                    result.add(matrix[row][col]);
                    row--;
                }
                row++;
                col++;
                height--;
                rightDown = !rightDown;
            }
        }
        return result;
    }
}