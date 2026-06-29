class MinStack {

    constructor() {
        this.st = []
        this.ss =[]
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
       this.st.push(val)
       if(this.ss.length ==0  || this.ss[ this.ss.length -1 ]>= val ) this.ss.push(val);
    }

    /**
     * @return {void}
     */
    pop() {
        if(this.st.length ==0) return -1
        let temp = this.st.pop()
        if(temp == this.ss[ this.ss.length -1 ] ) this.ss.pop()
    }

    /**
     * @return {number}
     */
    top() {
        return this.st[this.st.length-1]
    }

    /**
     * @return {number}
     */
    getMin() {
        if(this.ss.length ==0 ) return -1
        return this.ss[ this.ss.length -1 ]
    }
}
