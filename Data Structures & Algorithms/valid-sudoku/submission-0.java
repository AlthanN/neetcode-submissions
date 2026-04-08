class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checks horizontally
        for(int i = 0; i < board.length; i++) {
            Set<Integer> set = new HashSet<Integer>();
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] != '.') {
                    int val = (int)(board[i][j]);
                    if(set.contains(val)) {
                        return false;
                    }
                    set.add(val);
                }
            }
        }

        //checks vertically
        for(int col = 0; col < board.length; col++) {
            Set<Integer> set = new HashSet<Integer>();
            for(int row = 0; row < board.length; row++) {
                if(board[row][col] != '.') {
                    int val = (int)(board[row][col]);
                    if(set.contains(val)) {
                        return false;
                    }
                    set.add(val);
                }
            }
        }
        //checks 3x3 box
        for(int row = 0; row < board.length; row = row + 3) {
            for(int col = 0; col < board.length; col = col + 3) {
                Set<Integer> set = new HashSet<Integer>();
                for(int miniR = row; miniR < row + 3; miniR++) {
                    for(int miniC = col; miniC < col + 3; miniC++) {
                        if(set.contains((int)board[miniR][miniC])) {
                            return false;
                        }
                        if(board[miniR][miniC] != '.') {
                            set.add((int)board[miniR][miniC]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
