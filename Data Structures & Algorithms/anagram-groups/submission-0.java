class Solution {
    private static  boolean isAnagram(String s , String t){
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
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> ans = new ArrayList<>();
         for(String s : strs){
            boolean done =  false ;
            for(int i = 0 ;i<ans.size();i++){
                if(isAnagram(s,ans.get(i).get(0))){
                    ans.get(i).add(s);
                    done = true ;
                    break ;
                }
            }
            if(!done){
                List<String> x = new ArrayList<>();
                x.add(s);
                ans.add(x);
            }
         }
           return ans ;
    }
  
}
