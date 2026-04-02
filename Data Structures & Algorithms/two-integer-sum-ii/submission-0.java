class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        int[] res=new int[2];
        while(low<high){
            
            if(numbers[low]+numbers[high]==target){
                res[0]=low+1;
                res[1]=high+1;
                break;
            }
            else if(numbers[low]+numbers[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
        return res;
    }
}
