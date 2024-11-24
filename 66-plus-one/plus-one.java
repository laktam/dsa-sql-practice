class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] + c > 9){
                digits[i] = 0;
                c = 1;
            }else{
                digits[i] = digits[i] + c;
                c = 0;
                break;
            }
        }
        if(digits[0] == 0){
            int out[] = new int[digits.length + 1];
            System.arraycopy(digits, 0, out, 1, digits.length);
            out[0] = 1;
            return out;
        }
        return digits;
    }
}