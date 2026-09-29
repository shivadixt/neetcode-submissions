class Solution {
    public int maxArea(int[] heights) {
        int maxA = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length - 1;
        while(l<r){
            int area = Math.min(heights[l],heights[r]) * (r-l);
            maxA = Math.max(maxA,area);
            if(heights[l] <= heights[r] ){
                l++;
            }else{
                r--;
            }
        }
        return maxA;
    }
}
