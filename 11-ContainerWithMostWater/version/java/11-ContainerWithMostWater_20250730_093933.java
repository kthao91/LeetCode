// Last updated: 7/30/2025, 9:39:33 AM
class Solution {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int max = 0;

        while(leftPointer < rightPointer){
            int h = Math.min(height[leftPointer], height[rightPointer]);  // shortest line
            int w = rightPointer - leftPointer;                           // distance between the lines
            int area = h * w;                                             // area = height * width
            max = Math.max(max, area);                                    // checking for the max
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;                                            // move left inward
            }
            else {
                rightPointer--;                                           // move right inward
            }
}

        return max;
        }
    }
