class Solution {
    static int mem[] = new int[46];
    public int climbStairs(int n) {
        Arrays.fill(mem,-1);
        return solve(n);
    }
    private int solve(int n ){
        if(n==0) return 1 ;
        if(n==1) return 1 ;
        if(mem[n]!=-1) return mem[n];

        mem[n] = solve(n-1)+ solve(n-2);
        return mem[n];
    }
}
