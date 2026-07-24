class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int freq[] = new int[128];
        int left = 0;
        int ans = 0;
        for(int right =0 ; right< s.length() ; right++){
            freq[s.charAt(right)]++;
            while(check(freq)==false){
                freq[s.charAt(left++)]--;

            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
        
    }
    private static boolean check(int arr[]){
        for(int x : arr){
            if (x>1) return false;
        }
        return true ;
    }
}
