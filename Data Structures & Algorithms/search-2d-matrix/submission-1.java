class Solution {
    public int row(int[][] mat,int k){
        int low=0;
        int high=Math.min(mat.length-1,99);
        while(low<=high){
            int mid=(high-low)/2+low;
            if(k>=mat[mid][0]&&k<=mat[mid][mat[0].length-1]) return mid;
            else if(k>mat[mid][0]&&k>mat[mid][mat[0].length-1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public int column(int[][] mat,int k,int r){
        int low=0;
        int high=Math.min(mat[0].length-1,99);
        while(low<=high){
            int mid=(high-low)/2+low;
            if(k==mat[r][mid]) return mid;
            else if(k>mat[r][mid]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=row(matrix,target);
        if(r==-1) return false;
        int c=column(matrix,target,r);
        if(c==-1) return false;
        return true;
    }
}
