class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Since we know that the first integer of every row is greater
        //Than the last, we can check the first integer to see
        //If it is less than, as we want to find the row where the first index
        //Is smaller than the target, then the next immediate row has a first index
        //Higher than the target


        int rows = matrix.length;
        int columns = matrix[0].length;

        //top is lo, bottom is hi
        int top = 0;
        int bottom = rows - 1;
        int rowIndex = 0;
        while(top <= bottom) {
            int mid = top + (bottom-top)/2;
            if(target > matrix[mid][columns - 1]) {
                top = mid + 1;
            } else if(target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                //we find our target range, and it is row mid
                rowIndex = mid;
                break;
            }
        }
        int lo = 0;
        int hi = columns - 1;
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(matrix[rowIndex][mid] == target) {
                return true;
            } else if(matrix[rowIndex][mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;

        
    }
}
