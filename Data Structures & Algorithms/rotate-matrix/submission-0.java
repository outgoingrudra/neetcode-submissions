class Solution {
    public void rotate(int[][] mat) {
        int m = mat.length ;
        for(int i = 0 ;i < m ;i++){
            for(int j =  i; j < m ;j++){
                 int t = mat[i][j];
                 mat[i][j] = mat[j][i];
                 mat[j][i] = t;
            }
        }
        for(int i  = 0 ; i < m ;i++){
            for(int j  = 0 ; j < (m/2) ; j++){
                 int t = mat[i][j];
                 mat[i][j] = mat[i][m-j-1];
                 mat[i][m-j-1] = t;
            }
        }
    }
}
