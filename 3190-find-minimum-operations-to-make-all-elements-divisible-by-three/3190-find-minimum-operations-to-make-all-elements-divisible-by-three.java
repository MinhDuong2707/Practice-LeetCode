class Solution {
    public int minimumOperations(int[] nums) {
        int n=0;
        for(int a: nums){
           int num=a%3;
           n+=Math.min(num,3-num);
        }
        return n;
    }
}