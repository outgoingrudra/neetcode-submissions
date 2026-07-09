class Pair{
    int x ;
    int y ;
    Pair(int x , int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
       
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> {
        return  (b.x*b.x + b.y*b.y) - (a.x*a.x + a.y*a.y)  ;
       });

       for(int arr[] : points ){
        pq.offer(new Pair(arr[0],arr[1]));
        if(pq.size()>k) pq.poll();
       }
       int[][] ans = new int[k][2];
       int i = 0;
       while(pq.size()!=0){
        Pair p = pq.poll();
           ans[i][0] = p.x;
           ans[i][1] = p.y;
           i++;
       }
       return ans ;
    }
}