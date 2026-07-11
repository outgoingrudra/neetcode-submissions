class Solution {
    /**
     * @param {number[][]} triplets
     * @param {number[]} target
     * @return {boolean}
     */
    mergeTriplets(triplets, target) {
        let foundA = false ;
        let foundB = false ;
        let foundC = false ;

        for(let  arr of triplets){
            if(arr[0]> target[0] || arr[1]> target[1] || arr[2]> target[2]) continue ;
            if(arr[0]==target[0]) foundA = true ;
            if(arr[1]==target[1]) foundB = true ;
            if(arr[2]==target[2]) foundC = true ;
        }
        return foundA && foundB && foundC ;
    }
}
