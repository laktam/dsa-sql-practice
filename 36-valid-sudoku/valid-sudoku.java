class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < 9; r++){
            if(!isValidRow(board[r])) return false;
        }
        for(int c = 0; c < 9; c++){
            if(!isValidColumn(board, c)) return false;
        }
        for(int r = 0; r < 7; r += 3){
            for(int c = 0; c < 7; c +=3){
                if(!is3x3Valid(board, c, r)) return false;
            }
        }
        return true;
    }

    private boolean isValidRow(char row[]){
        Set<Character> set = new HashSet<>();
        for(int c = 0; c < row.length; c++){
            if(row[c] == '.') continue;
            if(set.contains(row[c])) return false;
            else set.add(row[c]);
        }
        return true;
    }

    private boolean isValidColumn(char board[][], int column){
        Set<Character> set = new HashSet<>();
        for(int r = 0; r < 9; r++){
            if(board[r][column] == '.') continue;
            if(set.contains(board[r][column])) return false;
            else set.add(board[r][column]);
        }
        return true;
    }

    private boolean is3x3Valid(char board[][], int c, int r){
        Set<Character> set = new HashSet<>();
        for(int i = r; i < (r + 3); i++){
            for(int j = c; j < (c + 3); j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                else set.add(board[i][j]);
            }
        }
        return true;
    }
}