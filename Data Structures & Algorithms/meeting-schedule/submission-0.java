/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
      
      Collections.sort(intervals , (a,b)-> a.start -  b.start );

      int n  = intervals.size();
      int i  = 0 ;
      while(i < n){
        int start = intervals.get(i).start;
        int end = intervals.get(i).end;

        int j  = i +1 ;
       if(j < n && end > intervals.get(j).start ) return false ;
       i++;
      }
      return true ;
    }
}
