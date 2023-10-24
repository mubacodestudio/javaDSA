//classic binary search example

class BinarySearch {
    
    public static void main(String[] args) {
        int[] myNum = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findPeakElement(myNum, 16));
    }
    
     static int findPeakElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            
        int mid = start + (end - start) / 2;
        
        if(arr[mid] == target) {
            return mid;
        }
         
        if(target > arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        } 
        }
        return -1;
    }
}
