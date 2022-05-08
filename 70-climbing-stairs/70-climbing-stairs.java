class Solution {
    public int climbStairs(int n) {
        /*int dp[] = new int[n+1];
        dp[0] = 1;dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }
        return dp[n];
        */
        
        //it resembles fibonacci number problem
        
        int prev=1,pprev =1;
        for(int i=2;i<=n;i++){
            int curr = pprev+prev;
            pprev = prev;
            prev =curr;
        }
        return prev;
    }
}