class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (ref.containsKey(difference)) {
                return new int[] { ref.get(difference), i };
            }
            ref.put(nums[i], i);
        }
        return new int[] {};
    }
}