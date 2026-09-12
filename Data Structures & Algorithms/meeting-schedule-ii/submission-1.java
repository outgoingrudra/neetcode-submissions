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
    public int minMeetingRooms(List<Interval> intervals) {
  Collections.sort(intervals , (a,b)->{
    if(a.start!=b.start ) return  a.start -  b.start ;
    return a.end - b.end;

  } );

    
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int ans = 0;
        for (Interval meeting : intervals) {

            // A room has become free
            if (!pq.isEmpty() && pq.peek() <= meeting.start) {
                pq.poll();
            }

            // Allocate room for current meeting
            pq.offer(meeting.end);

            ans = Math.max(ans, pq.size());
        }
        return ans ;

    }
}
