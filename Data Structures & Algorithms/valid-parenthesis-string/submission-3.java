class Solution {
    public boolean checkValidString(String s) {
        
        int max  = 0;
        int cnt = 0;
        for(char c : s.toCharArray()){
           if(c == '('){
            max++;
            cnt++;
           }
           else if(c == ')'){
            max--;
            cnt--;
           }
           else {
            cnt--;
            max++;
           }
           if(cnt <0){
            cnt  = 0;
           }
           if(max < 0){
            return false ;
           }
        }
        return cnt == 0;
    }
}