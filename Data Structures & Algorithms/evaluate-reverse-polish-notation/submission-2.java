class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> st = new Stack<>();
         for( String s : tokens){
            if(isExp(s)){
                int a = st.pop();
                int b = st.pop();
                st.push(evaluate(b,a,s.charAt(0)));
            }
            else {
                st.push(Integer.parseInt(s));
            }
         }
         return st.pop();
    }
    private static int evaluate(int a,int  b,char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b ;
        }
        return 0;
    }
 private static boolean isExp(String s) {
    return s.equals("+") || s.equals("-") ||
           s.equals("*") || s.equals("/");
}
}
