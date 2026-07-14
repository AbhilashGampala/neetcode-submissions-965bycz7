class Solution {
    public int rob1(int[] nums,int start,int end){
        int l=end-start+1;
        if(l==1)return nums[start];
        int[] dp=new int[l];
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start], nums[start + 1]);
        for(int i=2;i<l;i++){
            dp[i]=Math.max(dp[i-2]+nums[i+start],dp[i-1]);
        }
        return dp[l-1];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return nums[0];
        return Math.max(rob1(nums,0,n-2),rob1(nums,1,n-1));
    }
}
