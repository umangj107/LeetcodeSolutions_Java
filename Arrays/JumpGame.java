class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }
        int maxReach = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(i > maxReach){
                return false;
            }
            maxReach = Math.max(maxReach, i+nums[i]);
            if(maxReach >= nums.length - 1){
                return true;
            }
        }
        return false;
        
    }
}