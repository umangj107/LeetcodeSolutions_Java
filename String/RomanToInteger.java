class Solution {
    public int romanToInt(String s) {        
        int n = s.length();
        int ans = 0, i = 0;
        while(i < n){
            if(i < n-1 && romanToValue(s.charAt(i)) < romanToValue(s.charAt(i+1))){
                ans += (romanToValue(s.charAt(i+1)) - romanToValue(s.charAt(i)));
                i+=2;
            } else{
                ans += romanToValue(s.charAt(i));
                i++;
            }
        }
        return(ans);
    }
    
    private int romanToValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}