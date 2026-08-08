class Solution {
    private int ROWS,COLS;
    public boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        for(int r =0;r<ROWS;r++){
            for(int c =0;c<COLS;c++){
                if(dfs(0,r,c,board,word)) return true;
            }
        }
        return false;
    }
    private boolean dfs(int index,int r,int c,char[][] board,String word){
        if(index == word.length()) return true;

        if(r<0 || c<0 || r >= ROWS || c>= COLS ||
        word.charAt(index) != board[r][c]|| board[r][c] == '#'){ return false;}

        board[r][c] ='#';
        boolean res = dfs(index+1,r+1,c,board,word) ||
                      dfs(index+1,r-1,c,board,word) ||
                      dfs(index+1,r,c+1,board,word) ||
                      dfs(index+1,r,c-1,board,word) ;
        board[r][c] = word.charAt(index);
                      return res;
    }
}