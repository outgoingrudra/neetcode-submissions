class Solution {
    /**
     * @param {TreeNode} root
     * @return {number[]}
     */
    rightSideView(root) {
        const ans = [];
        if (!root) return ans;

        const q = [root];

        while (q.length) {
            const size = q.length;

            for (let i = 0; i < size; i++) {
                const node = q.shift();

                if (node.left) q.push(node.left);
                if (node.right) q.push(node.right);

                if (i === size - 1) {
                    ans.push(node.val);
                }
            }
        }

        return ans;
    }
}