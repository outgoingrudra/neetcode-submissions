class Solution {
    /**
     * @param {number[]} nums
     * @return {void} Do not return anything, modify nums in-place instead.
     */
    sortColors(nums) {
         let left =0 , mid = 0 , right = nums.length -1 ;
        while(mid<=right){
            if(nums[mid]==1) mid++;
            else if(nums[mid]==0) swap(nums , mid++, left++);
            else swap(nums , mid, right--);
        }
    }
}

function swap( a , x ,  y){
         let t = a[x];
         a[x] = a[y];
         a[y]=t;
    }