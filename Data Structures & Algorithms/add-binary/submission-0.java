class Solution {
    public String addBinary(String a, String b) {
        String ans  = "";
        int carry  = 0 ;
        int i = a.length() - 1;
        int j = b.length() - 1;
        if(i == -1 ) return b ;
        if(j == -1 ) return a ;
        while(i >=0 && j >=0 ){
            int s = 0 ;
            if(a.charAt(i) == '1') s++;
            if(b.charAt(j) == '1') s++;
            s+= carry ;
            if(s == 0 || s== 2) ans = "0" + ans;
            else ans  = '1' + ans;
            carry = s / 2;
            i--;
            j--;

        }
        while(i >=0){
           int s = 0 ;
           if(a.charAt(i) == '1') s++; 
            s+= carry ;
            if(s == 0 || s== 2) ans = "0" + ans;
            else ans  = '1' + ans;
            carry = s / 2;
            i--;  
        }
          while(j >=0){
           int s = 0 ;
           if(b.charAt(j) == '1') s++; 
            s+= carry ;
            if(s == 0 || s== 2)  ans = "0" + ans; 
            else ans  = '1' + ans;
            carry = s / 2;
            j--;  
        }
        if(carry !=0){
            ans = '1' + ans ;
        }

        return ans ;
    }
}