class Solution {
    public void gameOfLife(int[][] board) {
        int newBoard[][] = new int[board.length][board[0].length];
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                newBoard[r][c] = applyRules(board, r, c);
            }
        }
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                board[r][c] = newBoard[r][c];
            }
        }
    }

    private int applyRules(int board[][], int r, int c){
        int status = board[r][c];
        int aliveNeighbors = calculateAliveNeighbors(board, r, c);
        if(status == 1){
            if(aliveNeighbors < 2){
                return 0;
            }
            else if(aliveNeighbors == 2 || aliveNeighbors == 3){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(aliveNeighbors == 3){
            return 1;
        }
        return status;

    }

    private int calculateAliveNeighbors(int board[][], int r, int c){
        int alive = 0;
        if(r - 1 >= 0 ){
            // top left
            if(c - 1 >= 0){
                alive += board[r - 1][c - 1];
            }
            // top center
            alive += board[r - 1][c];
            // top right
            if(c + 1 < board[r - 1].length){
                alive += board[r - 1][c + 1];
            }
        }
        // left
        if(c - 1 >= 0){
            alive += board[r][c - 1];
        }
        // right
        if(c + 1 < board[r].length){
            alive += board[r][c + 1];
        }
        // bottum
        if(r + 1 < board.length){
            // left
            if(c - 1 >= 0){
                alive += board[r + 1][c - 1];
            }
            // center
            alive += board[r + 1][c];
            // right
            if(c + 1 < board[r + 1].length){
                alive += board[r + 1][c + 1];
            }
        }
        return alive;
    }
}