class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    majorityElement(v) {
    let el1= 0; let el2 =0 ; let cnt1 =0; let cnt2= 0;
     for(let i =0 ;i< v.length ;i++){
        if(cnt1 ==0 && v[i]!= el2){
            el1 = v[i];
            cnt1++;
        }
        else if(cnt2==0 && v[i]!= el1){
            el2 = v[i];
            cnt2++;
        }
        else if(v[i]==el1) cnt1++;
        else if(v[i]==el2) cnt2++;
        else {cnt1--;cnt2--;}
     }
     cnt1=0;cnt2=0;
     for(let x  of  v){
         if(x==el1) cnt1++;
         else if(x==el2)  cnt2++;
     }
    let ans = []
     let n  = v.length;
     if(cnt1>n/3) ans.push(el1);
     if(cnt2>n/3) ans.push(el2);
     return ans ;

    }
}
