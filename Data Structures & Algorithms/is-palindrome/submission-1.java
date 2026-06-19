class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        int i =0 , j = s.length()-1;
        while(i<=j){
            if(!(('a'<= s.charAt(i) && s.charAt(i)<= 'z') || ('A'<= s.charAt(i) && s.charAt(i)<= 'Z') ||('0'<= s.charAt(i) && s.charAt(i)<= '9'))){i++;}
            else if(!(('a'<= s.charAt(j) && s.charAt(j)<= 'z') || ('A'<= s.charAt(j) && s.charAt(j)<= 'Z')||('0'<= s.charAt(j) && s.charAt(j)<= '9'))){j--;}
          else{
                if(s.charAt(i)!=s.charAt(j)){
                    return false ;
                    
                }
                else{
                     i++;
                     j--;
                }
            }
            
           
        }
        return true ;
    }
}
