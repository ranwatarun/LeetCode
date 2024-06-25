class Solution {
    public int maxArea(int[] height) {
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int maxArea  = 0;
        
        while(ptr1<ptr2){
            int currArea = (ptr2-ptr1)*Math.min(height[ptr1], height[ptr2]);
            maxArea = Math.max(currArea, maxArea);

            if(height[ptr1] < height[ptr2]){
                ptr1++;
            }
            else{
                ptr2--;
            }
        }

        return maxArea;

        
            
        
    }
}