class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        int i=0;
        while(i<nums.length){
            int j=0;
            for(int s:nums){
                if(nums[i]>s) j++;
            }
            array[i]=j;
            i++;
        }
        return array;        
    }
}