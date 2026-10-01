class Solution {
    public String minWindow(String s, String t) {
        int tfreq[] = new int[128];
        for(char c : t.toCharArray()){
            tfreq[c]++;
        }
        int freq[] = new int[128];
        int left = 0;
        String ans= "";
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right)]++;

            while(valid(tfreq,freq)){
                  if(ans.isEmpty() || right-left+1 < ans.length() ){
                    ans = s.substring(left,right+1);
                  }
                  freq[s.charAt(left)]--;
                  left++;
            }
          


        }
        return ans ;

    }

    private static boolean valid(int a[] , int b[]){
        for(int i = 0; i< a.length ;i++){
            if(a[i]>b[i]) return false;
        }
        return true ;
    }
}