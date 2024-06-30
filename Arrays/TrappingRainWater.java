//First Solution -- Working
// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int[] maxLeft = new int[n];
//         int[] maxRight = new int[n];
        
//         maxLeft[0] = 0;
//         for(int i = 1; i< n; i++){
//             maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
//         }
        
//         maxRight[n-1] = 0;
//         for(int j = n-2; j>=0; j--){
//             maxRight[j] = Math.max(maxRight[j+1], height[j+1]);
//         }
        
//         int water = 0;
//         for(int i =0; i<n; i++){
//             if(maxLeft[i] != 0 && maxRight[i] != 0 && height[i] < maxLeft[i] && height[i] < maxRight[i]){
//                 water += ((Math.min(maxLeft[i], maxRight[i]) - height[i]));
//             }
//         }
//         return(water);
//     }
// }

//Two Pointer Solution
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int Lmax = 0, Rmax = 0;
        int water = 0;
        
        while(l < r){
            if(height[l] < height[r]){
                if(height[l] > Lmax){
                    Lmax = height[l];
                } else{
                    water += (Lmax - height[l]);
                }
                l++;
            } else{
                if(height[r] > Rmax){
                    Rmax = height[r];
                }else {
                    water += (Rmax - height[r]);
                }
                r--;
            }
        }
        return(water);
    }
}