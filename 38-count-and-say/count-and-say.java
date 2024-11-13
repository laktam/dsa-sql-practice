class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String tmp = "1";
        for(int i = 1; i < n; i++){
            tmp = rLE(tmp);
        }
        return tmp;
        // return rLE(countAndSay(n - 1));
    }

    private String rLE(String s){
        if(s.length() == 1) {
            return "1" + s;
        }
        String result = "";
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) == s.charAt(i)) {
                if(i == s.length() - 1 ){
                    result += "" + ++count + s.charAt(i);
                    count = 1;
                }else{
                    count++;
                }
            }
            else {
                if(i == s.length() - 1 ){
                    result += "" + count + s.charAt(i - 1);
                    result += "1" + s.charAt(i);
                }else{
                    result += "" + count + s.charAt(i - 1);
                    count = 1;
                }
                
            }

        }
        return result;
    }
}