class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int index = n;
        int currIndex = 0;
        while(currIndex < index){
            if(nums[currIndex] == val){
                for(int x = currIndex; x < index-1; x++){
                    nums[x] = nums[x+1];
                }
                index--;
                nums[index] = val;
            } else{
                currIndex++;
            }
        }
        return index;
    }
}