class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R=matrix.length,C=matrix[0].length;
        int low=0,high=R*C-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midval=matrix[mid/C][mid%C];
            if(midval==target) return true;
            else if(target<midval){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}