class Solution {

    public String encode(List<String> strs) {
           String ans = "" ;
           for (String s : strs){
            ans = ans + s+"-";
           }
           return ans;
    }

    public List<String> decode(String str) {
            List<String> ans = new ArrayList<>();
            String s = "";
            for(int i = 0; i<str.length() ;i++){
                if(str.charAt(i)=='-' ){
                    ans.add(s);
                    s="";
                }
                else{
                    s+= str.charAt(i);
                }
            }
            return ans ;
    }
}
