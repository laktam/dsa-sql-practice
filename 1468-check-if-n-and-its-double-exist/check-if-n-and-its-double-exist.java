class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i] * 2) || (set.contains(arr[i] / 2) && arr[i] % 2 == 0)) return true;
            else set.add(arr[i]);
        }
        return false;
    }
}