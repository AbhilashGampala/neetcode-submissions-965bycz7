class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];
        ans[arr.length-1]=-1;
        int max=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(max<arr[i+1]){
                max=arr[i+1];
            }
            ans[i]=max;
        }
        return ans;
    }
}