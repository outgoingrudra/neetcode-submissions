class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        int ans = 0;
        for(int x : set){
            if(set.contains(x-1)) continue ;
            int cnt  = 1;
            while(set.contains(x+1)){
                cnt++;
                x++;
            }
            ans = Math.max(ans,cnt);

        }
        return ans ;
    }
}
