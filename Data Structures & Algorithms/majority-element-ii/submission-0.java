class Solution {
    public List<Integer> majorityElement(int[] v) {
       
     int el1= 0; int el2 =0 ; int cnt1 =0; int cnt2= 0;
     for(int i =0 ;i< v.length ;i++){
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
     for(int x : v){
         if(x==el1) cnt1++;
         else if(x==el2)  cnt2++;
     }
     List<Integer> ans = new ArrayList<>();
     int n  = v.length;
     if(cnt1>n/3) ans.add(el1);
     if(cnt2>n/3) ans.add(el2);
     return ans ;
    }
}