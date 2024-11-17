class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] t = new boolean[board.length][board[0].length];
        for(int row = 0; row < t.length; row++){
            Arrays.fill(t[row], false);
        }

        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                char c = board[row][column];
                if(word.length() == 1 && word.charAt(0) == c) return true;
                t[row][column] = true;
                if(c == word.charAt(0) && find(t, board, word.substring(1), row, column)){
                    return true;
                }
                t[row][column] = false;
            }
        }
        return false;
    }

    public boolean find(boolean[][] t, char[][] board, String word, int row, int column){
        // top center
        if(row - 1 >= 0 && !t[row - 1][column]){
            if(board[row - 1][column] == word.charAt(0)){
                if(word.length() == 1) return true;
                t[row - 1][column] = true;
                boolean found = find(t, board, word.substring(1), row - 1, column);
                if(found){
                    return true;
                }
                t[row - 1][column] = false;
            }
        }
        // left
        if(column - 1 >= 0 && !t[row][column - 1]){
            if(board[row][column - 1] == word.charAt(0)){
                if(word.length() == 1) return true;
                t[row][column - 1] = true;
                boolean found =  find(t, board, word.substring(1), row, column - 1);
                if(found){
                    return true;
                }
                t[row][column - 1] = false;
            }
        }
        // bottom center
        if(row + 1 < board.length && !t[row + 1][column]){
            if(board[row + 1][column] == word.charAt(0)){
                if(word.length() == 1) return true;
                t[row + 1][column] = true;
                boolean found = find(t, board, word.substring(1), row + 1, column);
                if(found){
                    return true;
                }
                t[row + 1][column] = false;
            }
        }
        // right
        if(column + 1 < board[row].length && !t[row][column + 1]){
            if(board[row][column + 1] == word.charAt(0)){
                if(word.length() == 1) return true;
                t[row][column + 1] = true;
                boolean found = find(t, board, word.substring(1), row, column + 1);
                if(found){
                    return true;
                }
                t[row][column + 1] = false;
            }
        }

        return false;
    }
}