static class Pair{
    int val ;
    int idx ;
    Pair(int val,int idx){
        this.val =val ;
        this.idx = idx;
    }
}
class Solution {
    private static int[] NGE(int arr[]){
        int n = arr.length ;
        Stack<Pair> st = new Stack<>();
        int ans[] = new int[n];
        for(int i = n-1;i>=0 ;i--){
            if(st.size()==0){
                ans[i] = -1;
            }else{
                while(st.size() !=0 && st.peek().val<= arr[i]) st.pop();
                if(st.size()==0) ans[i] = -1;
                else {
                    ans[i] = st.peek().idx;
                }
            }
            st.push(new Pair(arr[i],i));
        }
        return ans ;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] = temperatures;
        int n = arr.length ;
        int[] result = new int[n];
        int[] nums = NGE(arr);
        for(int i  = 0 ;i< n ;i++){
            if(nums[i]==-1){
                result[i] = 0;
            }
            else {
                result[i] = nums[i] - i;
            }
        }
        return result;

    }
}
