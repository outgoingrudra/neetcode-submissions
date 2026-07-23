class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @return {boolean}
     */
    checkInclusion(s1, s2) {
        if (s1.length > s2.length) {
            return false;
        }

        const freq = new Array(26).fill(0);

        for (const c of s1) {
            const index = c.charCodeAt(0) - 97;
            freq[index]++;
        }

        let left = 0;
        const k = s1.length;

        for (let right = 0; right < s2.length; right++) {
            const rightIndex = s2.charCodeAt(right) - 97;
            freq[rightIndex]--;

            if (right - left + 1 === k) {
                if (checkZeros(freq)) {
                    return true;
                }

                const leftIndex = s2.charCodeAt(left) - 97;
                freq[leftIndex]++;
                left++;
            }
        }

        return false;
    }
}

function checkZeros(arr) {
    for (const x of arr) {
        if (x !== 0) {
            return false;
        }
    }

    return true;
}