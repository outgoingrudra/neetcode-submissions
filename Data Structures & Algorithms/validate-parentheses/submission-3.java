class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for(char s : str.toCharArray()){
          if(s == '(' || s=='{' || s=='['){
                    st.push(s);
          }
          else{
            if(st.size()==0) return false ;
            char pop = st.pop();
           if(!(( s=='}' && pop=='{')|| ( s==']' && pop=='[')||( s==')' && pop=='('))) return false;
          }
        }
        return st.isEmpty();
    }
}
