class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st =  new Stack<>();
        for(String c : operations){
            if(c.equals("+")){
                int x  =Integer.parseInt( st.pop());
                int y = Integer.parseInt(st.peek());
                st.push(Integer.toString(x));
                st.push(Integer.toString(x+y));
            }
            else if(c.equals("D")){
                st.push(Integer.toString(Integer.parseInt(st.peek())*2));
            }
            else if(c.equals("C")) st.pop();
            else st.push(c);
        }
        int ans = 0;
        while(st.size()!=0){
            ans += Integer.parseInt(st.pop());
        }
        return ans ;
    }
}