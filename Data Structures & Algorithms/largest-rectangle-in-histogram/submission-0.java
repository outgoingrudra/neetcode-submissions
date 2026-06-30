class Solution {
    private static int[] NSL(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];

    for (int i = 0; i < n; i++) {

        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }

        ans[i] = st.isEmpty() ? -1 : st.peek();

        st.push(i);
    }

    return ans;
}
      private static int[] NSR(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[n];

    for (int i = n - 1; i >= 0; i--) {

        while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
            st.pop();
        }

        ans[i] = st.isEmpty() ? n : st.peek();

        st.push(i);
    }

    return ans;
}
    public int largestRectangleArea(int[] arr) {
            int n = arr.length ;
            int[] nsl = NSL(arr);
            int[] nsr = NSR(arr);
            int ans = 0;
            for(int i = 0;i<n ;i++){
                int width = nsr[i]- nsl[i] -1 ;
                int area = width * arr[i];
                ans = Math.max(ans , area);
            }
            return ans ;
    }
}
