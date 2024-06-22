class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int slow = 0, fast = 1;
        int duplicateCount = 1;
        while(fast < n){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow] = nums[fast];
                duplicateCount = 1;
            }else if(nums[slow] == nums[fast] && duplicateCount < 2){
                slow++;
                nums[slow] = nums[fast];
                duplicateCount++;
            }
            fast++;
        }
        return slow + 1;
    }
}