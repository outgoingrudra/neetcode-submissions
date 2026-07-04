class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Stack<Double> st = new Stack<>();

        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));

        st.push((target - cars[n - 1][0]) / (double) cars[n - 1][1]);

        for (int i = n - 2; i >= 0; i--) {
            double timeTaken = (target - cars[i][0]) / (double) cars[i][1];

            if (timeTaken > st.peek()) {
                st.push(timeTaken);
            }
        }

        return st.size();
    }
}