class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n  = hand.length ;
        if(hand.length%groupSize!=0) return false ;

        TreeMap<Integer,Integer> mpp = new TreeMap<>();
        for(int x : hand){
            mpp.put(x,mpp.getOrDefault(x,0)+1);
        }
        while(mpp.isEmpty()==false){
            int first = mpp.firstKey() ;
            for(int i = 0;i < groupSize ;i++){
                int curr = first + i;
                if(!mpp.containsKey(curr)) return false ;
                mpp.put(curr,mpp.get(curr)-1);
                if(mpp.get(curr)==0) mpp.remove(curr);
            }
        }
        return true ;
    }
}
