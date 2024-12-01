class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int l = i; 
            int r = arr.length - 1;
            while(r >= 0){
                if(l == r) {
                    r--;
                    continue;
                };
                int doubleL = arr[l] * 2;
                System.out.println(doubleL);
                if(doubleL == arr[r]) return true;
                else r--;
            }
        }
        return false;
    }
}