class Solution {
    public boolean isPossible(int[] piles,int h,int k){
        int count=0;
        if(k==0) return false;
        for(int i=0;i<piles.length;i++){
            count+=piles[i]/k;
            if(piles[i]%k>0) count++;
        }
        if(count<=h) return true;
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(isPossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
}
