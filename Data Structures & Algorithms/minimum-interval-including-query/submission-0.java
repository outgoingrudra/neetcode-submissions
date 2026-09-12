class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int ans[] = new int[queries.length];
        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);
       int[][] qs = new int[queries.length][2];
       for (int i = 0; i < queries.length; i++) {
            qs[i][0] = queries[i]; // query
            qs[i][1] = i;          // original index
        }
       Arrays.sort(qs, (a, b) -> a[0] - b[0]);
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );
         int i = 0;
         
        for (int[] q : qs) {

            int query = q[0];

            // Add intervals that have started
            while (i < intervals.length &&
                   intervals[i][0] <= query) {

                int left = intervals[i][0];
                int right = intervals[i][1];

                int length = right - left + 1;

                pq.offer(new int[]{length, right});

                i++;
            }

            // Remove intervals that have already ended
            while (!pq.isEmpty() && pq.peek()[1] < query) {
                pq.poll();
            }

            // Shortest valid interval
            if (!pq.isEmpty()) {
                ans[q[1]] = pq.peek()[0];
            } else {
                ans[q[1]] = -1;
            }
        }

        return ans;

    }
}
