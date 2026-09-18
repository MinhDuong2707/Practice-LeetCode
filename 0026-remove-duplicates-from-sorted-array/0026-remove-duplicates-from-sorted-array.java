class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=j+1; i<nums.length; i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}