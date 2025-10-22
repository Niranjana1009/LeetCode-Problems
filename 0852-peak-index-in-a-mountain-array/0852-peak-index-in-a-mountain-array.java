class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1,high = n-2;
        while(low <= high){
            int mid =  low +(high-low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1])
                low = mid + 1;
            else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1])
                high = mid - 1;
        }
        return 0;
    }
}