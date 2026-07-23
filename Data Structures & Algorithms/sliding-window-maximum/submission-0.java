class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        int left = 0;
        for(int right= 0; right < nums.length ; right++){
               while(dq.size()!=0 && nums[dq.peekLast()]<= nums[right]) {
                          dq.pollLast();
               }
               dq.addLast(right);

               if(right-left+1==k){
                       ans[left] = nums[dq.peekFirst()];
                       if(dq.peekFirst()==left) dq.pollFirst(); 
                       left++;

               }
        }
        return ans;

    }
}