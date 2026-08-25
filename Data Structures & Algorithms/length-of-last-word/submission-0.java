class Solution {
    public int lengthOfLastWord(String s) {
        boolean t  = false ;
        int n = s.length();
        int x = n ;
        for(int i = n -1 ; i >= 0 ;i--){
              if(t && s.charAt(i)==' ') return  x - i ;
              if(t==false && s.charAt(i)!=' '){
                t= true ;
                x = i;
              }
        }
        return n ;
        
    }
}