class Solution {
    Set<Integer> col = new HashSet<>();
    Set<Integer> posdiag = new HashSet<>();
    Set<Integer> negdiag = new HashSet<>();
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row,'.');
        }
        backtrack(0,n,board);
        return ans;
    }

    private void backtrack(int r,int n,char[][] board){
        if(r==n){
            List<String> copy = new ArrayList<>();
            for(char[] row : board){
                copy.add(new String(row));
            }
            ans.add(copy);
            return;
        }
        for(int c =0;c<n;c++){
            if(col.contains(c) || posdiag.contains(r+c) || negdiag.contains(r-c)) continue;
            col.add(c);
            posdiag.add(r+c);
            negdiag.add(r-c);
            board[r][c] = 'Q';
            
            backtrack(r+1,n,board);

            col.remove(c);
            posdiag.remove(r+c);
            negdiag.remove(r-c);
            board[r][c] = '.';

        }
    }
}