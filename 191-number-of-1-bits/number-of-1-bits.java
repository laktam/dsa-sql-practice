class Solution {
    public int hammingWeight(int n) {
        String ones = "1";
        while(n / 2 != 0){
            if(n % 2 == 1){
                ones = ones + (n % 2);      
            }
            n = n / 2; 
        }
        return ones.length();
    }
}