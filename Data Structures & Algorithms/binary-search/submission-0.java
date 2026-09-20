class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int curr = l + ((r-l)/2);
            if(nums[curr] == target){
                return curr;
            }
            else if(nums[curr] < target){
                l = curr + 1;
            }
            else{
                r = curr - 1;
            }
            
        }
        return -1;
    }
}
