class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<n;i++){ //row 1
            if(board[0][i]=='O'){
                visit(0,i,board);
            }
        }
        for(int i=0;i<m;i++){ // col 1
            if(board[i][0]=='O'){
                visit(i,0,board);
            }
        }
        for(int i=0;i<n;i++){ //row n
            if(board[m-1][i]=='O'){
                visit(m-1,i,board);
            }
        }
        for(int i=0;i<m;i++){ //col n
            if(board[i][n-1]=='O'){
                visit(i,n-1,board);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='1')
                    board[i][j]='O';
            }
        }
    }
    public static void visit(int i, int j, char [][] board){
        board[i][j]='1';
        int n = board.length;
        int m = board[0].length;
        if(i+1<n && board[i+1][j]=='O'){
            visit(i+1,j,board);
        }
        if(i-1>=0 && board[i-1][j]=='O'){
            visit(i-1,j,board);
        }
        if(j+1<m && board[i][j+1]=='O'){
            visit(i,j+1,board);
        }
        if(j-1>=0 && board[i][j-1]=='O'){
            visit(i,j-1,board);
        }
    }
    
}