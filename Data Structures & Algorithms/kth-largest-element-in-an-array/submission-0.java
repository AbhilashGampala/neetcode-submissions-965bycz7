class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=Integer.MIN_VALUE;
        PriorityQueue<Integer> q=new PriorityQueue<>((x,y)->{
            if(x>=y) return -1;
            else return 1;
        });
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        while(k-->0){
            ans=q.poll();
        }
        return ans;
    }
}
