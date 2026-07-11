class Solution {
    /**
     * @param {number[]} hand
     * @param {number} groupSize
     * @return {boolean}
     */
    isNStraightHand(hand, groupSize) {
        hand.sort((a,b) => a-b)
        const mpp = new Map()
        for(let el of hand){
            mpp.set(el,(mpp.get(el)||0)+1)
        }
        for(let num of hand){
          if(mpp.get(num)==0) continue 
           for(let i = 0 ; i< groupSize ;i++){
              let curr = num + i
              if(!mpp.has(curr) || mpp.get(curr)==0) return false 
              mpp.set(curr,mpp.get(curr)-1)
           }
        }
        return true 
    }
}
