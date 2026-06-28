class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int result=0;
        int i=0;
        while(i<=nums.length){
            if(!set.contains(i)){
                result=i;
                break;
            }
            i++;
        }
        return result;
    }
}