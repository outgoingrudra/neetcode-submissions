class Solution {
    List<List<String>> ans ;
    public List<List<String>> partition(String s) {
          ans = new ArrayList<>();
          solve(s,0, new ArrayList<>());
          return ans ;
    }
    private void solve(String s ,int idx , List<String> curr){
        if(idx==s.length()){
             ans.add(new ArrayList<>(curr));
             return ;
        }

        for(int i = idx ; i < s.length() ;i++){
            if(isPalindrome(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                solve(s,i+1,curr);
                curr.remove(curr.size()-1);
            }

        }

    }
    private boolean isPalindrome(String s , int l , int r){
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
