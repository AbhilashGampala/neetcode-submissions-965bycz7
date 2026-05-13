class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=(n1+n2)/2+1;
        int i=0;
        int j=0;
        int temp=0;
        int prev=0;
        while(i<n1&&j<n2&&n-->0){
            if(nums1[i]<=nums2[j]){
                prev=temp;
                temp=nums1[i];
                i++;
            }
            else{
                prev=temp;
                temp=nums2[j];
                j++;
            }
        }
        while(i<n1&&n-->0){
                prev=temp;
            temp=nums1[i];
            i++;
        }
        while(j<n2&&n-->0){
                prev=temp;
            temp=nums2[j];
            j++;
        }
        if((n1+n2)%2==0){
            return ((double)(temp+prev)/2);
        }
        return (double)(temp);
    }
}
