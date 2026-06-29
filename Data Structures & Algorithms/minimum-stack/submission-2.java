class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> ss;
    public MinStack() {
        s = new Stack<>();
        ss = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(ss.size()==0 || val<=ss.peek()) ss.push(val);
    }
    
    public void pop() {
        if(s.size()==0) return ;
        int temp = s.pop();
        if(temp==ss.peek()) ss.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        if(ss.size()==0) return -1;
        return ss.peek();
    }
}
