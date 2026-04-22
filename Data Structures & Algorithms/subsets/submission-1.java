class Solution {
    
    public void subset(int[] nums,int i,List<Integer> r,List<List<Integer>> l) {
        if(i==nums.length){
            l.add(new ArrayList<>(r));
            return;
        }
        r.add(nums[i]);
        subset(nums,i+1,r,l);
        r.remove(r.size()-1);
        subset(nums,i+1,r,l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> r=new ArrayList<>();
        subset(nums,0,r,l);
        return l;
    }
}
