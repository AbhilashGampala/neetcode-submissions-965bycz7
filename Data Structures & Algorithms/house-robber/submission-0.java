class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int pre[] =new int[nums.length];
        pre[0]=nums[0];
        if(nums.length==1) return pre[0];
        pre[1]=Math.max(pre[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            pre[i]=Math.max(pre[i-2]+nums[i],pre[i-1]);
        }
        return pre[nums.length-1];
    }
}
