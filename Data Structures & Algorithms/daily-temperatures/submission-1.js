class Solution {
    /**
     * @param {number[]} temperatures
     * @return {number[]}
     */
    dailyTemperatures(temperatures) {
              let arr = temperatures
              let n = arr.length 
              let ans = []
              let com = this.NGE(arr)
              for(let i = 0 ;i < n ;i++){
                if(com[i]==-1) ans.push(0)
                else  ans.push(com[i]-i)
              }
              return ans 
    }
    NGE(arr){
      
        let st = []
        let n = arr.length
        let ans= new Array(n)

        for(let i = n-1 ; i>= 0;i--){
            if(st.length ==0) ans[i] = -1
            else{
                  while(st.length != 0 && st[st.length-1][0]<= arr[i]) st.pop()
                  if(st.length == 0) ans[i] = -1
                  else ans[i] =  st[st.length-1][1]
            }
            st.push([arr[i],i])
        }
        return ans 
    }
}

