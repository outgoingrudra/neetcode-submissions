class Solution {
    /**
     * @param {character[][]} grid
     * @return {number}
     */
    numIslands(grid) {
    return solve(grid)
    }
}

function solve(grid){
    let m = grid.length 
    let n = grid[0].length 
  let vis = []
for (let i = 0; i < m; i++) vis.push(new Array(n).fill(-1))

    let ans = 0 
    for(let i = 0 ;i < m ;i++){
        for(let j = 0 ; j < n ;j++){
            if(grid[i][j]=='1' && vis[i][j]!=1){
                ans++;
                traverse(grid , vis , i , j)
            }
        }
    }
    return ans
}


function traverse(grid , vis , row , col){
    if(grid[row][col]!='1' || vis[row][col]==1) return 
    vis[row][col]=1
    let m = grid.length 
    let n = grid[0].length 
    let dr = [0,1,0,-1]
    let dc = [-1,0,1,0]
    for(let i = 0 ; i< 4 ;i++){
        let r = row + dr[i]
        let c = col + dc[i]
        if(r>=0 && r< m && c>=0 && c<n && grid[r][c]=='1' && vis[r][c]!=1)
           traverse(grid,vis,r,c)
    }
}