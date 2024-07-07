class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int empty = numBottles;
        
        while(empty >= numExchange){
            int exchanges = (int)(empty/numExchange);
            drank += exchanges;
            empty = empty + exchanges - (exchanges * numExchange);
        }
        return drank;
    }
}