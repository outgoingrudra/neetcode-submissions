class Solution {
    public boolean validPalindrome(String s) {
       
        int left = 0 ;
        int right = s.length()-1;
        while(left <= right){
            char x = s.charAt(left);
            char y = s.charAt(right);
           if (x!=y){
            return palindrome(s,left+1,right) || palindrome(s,left,right-1);
           }
           left++;
           right--;
        }
        return true ;
    }
    private boolean palindrome(String s , int x , int y){
        while(x<=y){
            if(s.charAt(x)!=s.charAt(y)) return false ;
            x++;
            y--;
        }
        return true;
    }
}