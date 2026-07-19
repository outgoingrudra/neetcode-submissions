class Solution {
    /**
     * @param {number[][]} matrix
     * @return {void}
     */
    setZeroes(matrix) {
        let m = matrix.length ;
        let n = matrix[0].length ;
        let r = new Array(m).fill(0)
        let c = new Array(n).fill(0)
        for(let i = 0 ; i < m ;i++){
            for(let j =0 ;j< n ;j++){
                if(matrix[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }

          for(let i = 0 ; i < m ;i++){
            for(let j =0 ;j< n ;j++){
                if(r[i]==1 || c[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
