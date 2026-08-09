class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;

        // Next Smaller Right

        int nsr[] = new int[heights.length];
        Stack<Integer> stack = new Stack();

        for(int i=heights.length-1; i>=0; i--) {

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = stack.peek();
            }
            
            stack.push(i);
        }

        // Next Smaller Left

        int nsl[] = new int[heights.length];
        stack = new Stack();

        for(int i=0; i<heights.length; i++) {

            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }

            stack.push(i);
        }

        // Current Area 

        for(int i=0; i<heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
        }
        
        return maxArea;
    }
}