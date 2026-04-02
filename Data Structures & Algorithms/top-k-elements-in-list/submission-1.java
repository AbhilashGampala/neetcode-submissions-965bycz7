class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> keys=new ArrayList<>();
        List<Integer> values=new ArrayList<>();
        for(int n:map.keySet()){
            keys.add(n);
            values.add(map.get(n));
        }
        Collections.sort(keys,(a,b)->{
            int x=map.get(a);
            int y=map.get(b);
            if(x!=y)
                return y-x;
            else 
                return 0;
        });
        for(int i=0;i<k;i++){
            ans[i]=keys.get(i);
        }
        return ans;
    }
}
