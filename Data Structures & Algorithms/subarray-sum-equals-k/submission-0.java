class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int sum  =  0;
        int ans = 0;
        for(int x : nums ){
            sum += x ;
            int diff  = sum  - k;
            if(mpp.containsKey(diff)) ans += mpp.get(diff);
            mpp.put(sum , mpp.getOrDefault(sum , 0) + 1);
        }
        return ans ;
    }
}