class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        long result = 0;
        int rows[] = new int[grid.length];
        int cols[] = new int[grid[0].length];
    
        for(int r = 0; r < grid.length; r++){
            int rowCounter = 0;
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c] == 1){
                    rowCounter++;
                }
            }
            rows[r] = rowCounter;
        }
        for(int c = 0; c < grid[0].length; c++){
            int columnCounter = 0;
            for(int r = 0; r < grid.length; r++){
                if(grid[r][c] == 1){
                    columnCounter++;
                }
            }
            cols[c] = columnCounter;
        }

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c] == 1){
                    result += ((rows[r] - 1) * (cols[c] - 1));
                }
            }
        }
        return result;
    }

    public int isRightTriangle(int grid[][], int row, int col){
        int rowCounter = 0;
        int columnCounter = 0;
        for(int r = 0; r < grid.length; r++){
            if(r == row) continue;
            if(grid[r][col] == 1){
                rowCounter++;
            }
        }
        if(rowCounter == 0) return 0;

        for(int c = 0; c < grid[row].length; c++){
            if(c == col) continue;
            if(grid[row][c] == 1){
                columnCounter++;
            }
        }
        return rowCounter * columnCounter;
    }
}