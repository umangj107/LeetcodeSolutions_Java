class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        int[] result = new int[1001];
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        for(int i =0; i<n1; i++){
            arr[nums1[i]]++;
        }
        
        int index = 0;
        for(int num : nums2){
            if(arr[num] > 0){
                result[index] = num;
                index++;
                arr[num]--;
            }
        }
        
        int[] r = new int[index];
        for(int i =0; i<index; i++){
            r[i] = result[i];
        }
        
        return r;
    }
}