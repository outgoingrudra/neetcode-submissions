class Solution {
    char[][] board  ;
    String word ;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        int m = board.length ;
        int n  = board[0].length ;

        for(int i = 0 ; i < m ;i++){
            for(int j = 0 ; j< n ;j++){
                if(possible(i,j,0)) return true ;
            }
        }
        return false ;
    }
    private boolean possible(int i , int j , int idx){
        if(idx==word.length()) return true ;

        if(i<0 ||  i>= board.length || j<0 || j>= board[0].length || board[i][j] != word.charAt(idx)) return false ;

        char c = board[i][j] ;
        board[i][j]='#';
        int dr[] =  new int[]{1,0,-1,0};
        int dc[] =  new int[]{0,1,0,-1};
         boolean ans = false;
        for(int x = 0 ;x< 4 ;x++){
             ans = ans || possible(i+ dr[x] , j + dc[x],idx+1);
        }
        board[i][j] =c;
        return ans;
    } 
}
