class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int j=0;
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[j];
            j=(j+1)%nums.length;
        }
        return ans;
    }
}