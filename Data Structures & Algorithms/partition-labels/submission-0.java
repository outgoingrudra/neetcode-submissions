class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<Integer>();
        Map<Character,Integer> mpp = new HashMap<>();

        int n = s.length() ;
        for(int i =  n-1 ;i>=0; i--){
            char c  = s.charAt(i);
            if(!mpp.containsKey(c)){
                mpp.put(c,i);
            }
        }

        int start = 0 ;
        int end = 0;

        for(int i = 0; i< n ;i++){
            end = Math.max(end , mpp.get(s.charAt(i)));
            if(i==end){
                ans.add(end-start+1);
                start = i+1 ;
            }
        }
        return ans ;

    }
}
