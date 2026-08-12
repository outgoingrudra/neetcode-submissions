class Solution {
    static int vis[][];
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        vis = new int[m][n];
        for(int v[] : vis) Arrays.fill(v,-1);
        int ans = 0;
        for(int i = 0 ; i < m ;i++){
            for(int j = 0 ; j< n ;j++){
                if(vis[i][j]!=1 && grid[i][j]=='1'){
                    traverse(grid,i,j);
                    ans++;
                }
            }
        }
        return ans ;

    }
    private static void traverse(char grid[][] , int s , int e ){
          int m = grid.length;
        int n = grid[0].length;
               if(grid[s][e]=='0') return ;
               if(vis[s][e]==1) return ;
               vis[s][e]=1;
               int dr[] =  new int[]{0,1,0,-1};
               int dc[] =  new int[]{-1,0,1,0};
               for(int i = 0 ;i < 4 ;i++){
                    int r = s+ dr[i];
                    int c = e+ dc[i];
                    if( r>=0 && r< m && c>=0 && c< n && grid[r][c]=='1' && vis[r][c]!=1){
                          traverse(grid,r,c);
                    }
               }
    }
}
