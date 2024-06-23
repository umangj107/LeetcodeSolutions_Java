class Solution {    
    public int jump(int[] nums) {
        int n = nums.length;
        int currReach = 0, maxReach = 0, jumps = 0;
        for(int i = 0; i < n-1; i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(currReach == i){
                jumps++;
                currReach = maxReach;
            }
        }
        return jumps;
    }
}