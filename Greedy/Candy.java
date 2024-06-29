class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        for(int i = 1; i< n; i++){
            if(ratings[i] > ratings[i-1]) result[i] = result[i-1]+1;
        }
        for(int j = n-2; j>=0; j--){
            if(ratings[j] > ratings[j+1]) result[j] = Math.max(result[j], result[j+1]+1);
        }
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=result[i];
        }
        return(sum);
    }
}