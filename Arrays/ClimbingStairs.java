class Solution {
    public int climbStairs(int n) {
        int[] stairs = new int[n];
        for(int i = 0; i< n; i++){
            stairs[i] = 0;
        }
        stairs[0] = 1;
        if(n >= 2) stairs[1] = 1;
        
        for(int i =0; i < n-1; i++){
            if(i+2 <= n-1){
                stairs[i+2] += stairs[i];
            }
            stairs[i+1] += stairs[i];            
        }
        return stairs[n-1];
    }
}