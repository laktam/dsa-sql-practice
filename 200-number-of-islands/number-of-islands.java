class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                if(grid[row][column] == '1'){
                    islands++;
                    sink(grid, row, column);
                }
            }
        }
        return islands;
    }

    private void sink(char[][] grid, int r, int c){
        grid[r][c] = '0';
        // top center
        if(r - 1 >= 0 ){
            if(grid[r - 1][c] == '1') {
                sink(grid, r - 1, c);
            }
        }
        // bottom center
        if(r + 1 < grid.length ){
            if(grid[r + 1][c] == '1') {
                sink(grid, r + 1, c);
            }
        }
        // left
        if(c - 1 >= 0){
            if(grid[r][c - 1] == '1') {
                sink(grid, r, c - 1);
            }
        }
        // right
        if(c + 1 < grid[r].length){
            if(grid[r][c + 1] == '1') {
                sink(grid, r, c + 1);
            }
        }
    }
}