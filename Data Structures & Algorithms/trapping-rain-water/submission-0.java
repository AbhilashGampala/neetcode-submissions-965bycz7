class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=height.length-1;
        int tot=0;
        while(l<r){
            lmax=Math.max(height[l],lmax);
            rmax=Math.max(height[r],rmax);
            if(lmax<rmax){
                tot+=lmax-height[l];
                l++;
            }
            else{
                tot+=rmax-height[r];
                r--;
            }
        }
        return tot;
    }
}
