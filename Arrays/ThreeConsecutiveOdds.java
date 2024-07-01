class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int oddCount = 0;
        for(int i =0; i<n; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
                if(oddCount == 3) return true;
            }else{
                oddCount = 0;
            }
        }
        return false;
    }
}