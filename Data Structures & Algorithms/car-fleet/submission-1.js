class Solution {
    /**
     * @param {number} target
     * @param {number[]} position
     * @param {number[]} speed
     * @return {number}
     */
    carFleet(target, position, speed) {
        const n = position.length;
        const stack = [];

        const cars = [];
        for (let i = 0; i < n; i++) {
            cars.push([position[i], speed[i]]);
        }

        cars.sort((a, b) => a[0] - b[0]);

        stack.push((target - cars[n - 1][0]) / cars[n - 1][1]);

        for (let i = n - 2; i >= 0; i--) {
            const time = (target - cars[i][0]) / cars[i][1];

            if (time > stack[stack.length - 1]) {
                stack.push(time);
            }
        }

        return stack.length;
    }
}