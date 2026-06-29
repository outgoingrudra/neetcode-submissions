class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let st =[]
        for(let x of tokens){
            if(this.isExp(x)){
                let a = Number(st.pop())
                let b = Number(st.pop())
                st.push( this.evaluate(b,a,x))
            }
            else{
                st.push(x)
            }
        }
        return st[0]

    }
    evaluate(a, b, op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return Math.trunc(a / b);
        }
    }
    isExp(s){
        return s=='+' || s=='-' || s=='*' || s=='/'
    }
}
