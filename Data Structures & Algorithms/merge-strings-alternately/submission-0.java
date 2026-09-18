class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder s  =  new StringBuilder("");
         int i = 0 ;
         int j = 0;
         int m  = word1.length();
         int n  = word2.length();
         while(i < m && j < n){
            s.append(word1.charAt(i++));
            s.append(word2.charAt(j++));
         }
         while (i < m ){
            s.append(word1.charAt(i++));
         }
           while (j < n ){
            s.append(word2.charAt(j++));
         }
         return s.toString();
    }
}