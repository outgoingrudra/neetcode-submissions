class Solution {
    public boolean isAnagram(String s, String t) {
      int []hash = new int[26];
      for(char x : s.toCharArray()){
        hash[x-'a'] +=1;
      }
    for(char x : t.toCharArray()){
        hash[x-'a'] -=1;
      }
      for(int x : hash){
        if(x!=0) return false ;
      }
      return true ;
      
    }
}
