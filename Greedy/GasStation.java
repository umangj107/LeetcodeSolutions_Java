class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int surplus = 0, deficit = 0, startIndex = 0;
        for(int i =0; i< n; i++){
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                startIndex = i+1;
                deficit += surplus;
                surplus = 0;
            }
        }
        if(surplus + deficit >= 0) return startIndex;
        else return(-1);
    }
}