class Solution {
    public void help(int[] nums,int sum,int idx,int target,List<Integer> in,List<List<Integer>> l){
        if(sum==target){
            l.add(new ArrayList<>(in));
            return;
        }
        if(sum>target|| idx==nums.length){
            return;
        }
        in.add(nums[idx]);
        help(nums,sum+nums[idx],idx,target,in,l);
        in.remove(in.size()-1);
        help(nums,sum,idx+1,target,in,l);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> l=new ArrayList<>();
        help(nums,0,0,target,new ArrayList<>(),l);
        return l;
    }
}
