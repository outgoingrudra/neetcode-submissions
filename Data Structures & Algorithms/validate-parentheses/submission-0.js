class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(str) {
            const st =[]
            for(let s of str){
                if(s == '(' || s=='{' || s=='['){
                    st.push(s)
                }
                else{
                    let  obj ={
                        '{' : '}',
                        '[': ']',
                        '(':')'
                     }
                    if(s!=obj[st.pop()]){
                        return false 
                    }
                }
            }
            return st.length ==0
    }
}
