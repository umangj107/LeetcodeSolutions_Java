class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i <= n; i++) arr.add(0);
        
        for(int num : nums){
            arr.set(num, arr.get(num)+1);
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i =1; i<=n; i++){
            if(arr.get(i) == 0){
                res.add(i);
            }
        }
        
        return res;
    }
}