class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        for(String s : logs){
            if(s.startsWith("..")){
                if(steps != 0) steps--;
            } else if(s.startsWith(".")) {
                continue;
            } else{
                steps++;
            }
        }
        return steps;
    }
}