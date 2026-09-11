class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean foundA = false ;
        boolean foundB = false ;
        boolean foundC = false ;
        
        for(int a[] : triplets){
            if(a[0] > target[0] || a[1] > target[1] || a[2] > target[2]) continue ;
            if(a[0]==target[0]) foundA = true ;
            if(a[1]==target[1]) foundB = true ;
            if(a[2]==target[2]) foundC = true ;

        }
        return foundA && foundB && foundC;
    }
}
