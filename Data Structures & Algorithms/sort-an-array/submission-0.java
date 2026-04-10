class Solution {
    public void merge(int[] nums,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int k=low;
        int[] b=new int[nums.length];
        while(i<=mid&&j<=high){
            if(nums[i]<=nums[j]){
                b[k++]=nums[i++];
            }
            else{
                b[k++]=nums[j++];
            }
        }
        while(i<=mid){
            b[k++]=nums[i++];
        }
        while(j<=high){
            b[k++]=nums[j++];
        }
        for(int x=low;x<=high;x++){
            nums[x]=b[x];
        }
    }
    public void mergesort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=(high-low)/2+low;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}