class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;

        for(int i = digits.length - 1; i >= 0; i--){
            int tmp = digits[i] + c;
            if(tmp > 9){
                c = tmp - digits[i];
                digits[i] = 0;
            }else{
                digits[i] = digits[i] + c;
                c = 0;
            }
        }
        if(digits.length != 0 && digits[0] == 0){
            int r[] = new int[digits.length + 1];
            r[0] = 1;
            if(digits.length > 1){
                for(int i = 1; i < digits.length; i++){
                    r[i + 1] = digits[i];
                }
            }
            
            return r;
        }
        return digits;
    }
}