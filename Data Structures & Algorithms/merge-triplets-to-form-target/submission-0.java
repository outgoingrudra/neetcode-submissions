class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean foundA = false ;
        boolean foundB = false ;
        boolean foundC = false ;

        for(int arr[] : triplets){
            if(arr[0]> target[0] || arr[1]> target[1] || arr[2]> target[2]) continue ;
            if(arr[0]==target[0]) foundA = true ;
            if(arr[1]==target[1]) foundB = true ;
            if(arr[2]==target[2]) foundC = true ;
        }
        return foundA && foundB && foundC ;
    }
}
