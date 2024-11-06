class Solution {
    public int reverse(int x) {
        String s = "";
        if(x < 0){
            s = String.valueOf(x).substring(1);
        }else {
            s = String.valueOf(x);
        }
        char charList[] = s.toCharArray();
        int l = 0;
        int r = charList.length - 1;
        while(l < r){
            char tmp = charList[r];
            charList[r] = charList[l];
            charList[l] = tmp;
            l++;
            r--;
        }
        s = String.valueOf(charList);
        try{
            if(x < 0){
                return Integer.parseInt(s)  * -1;
            }else {
                return Integer.parseInt(s);
            }
        }catch(Exception e){
            return 0;
        }
    }
}