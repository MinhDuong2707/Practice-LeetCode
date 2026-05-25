class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max= 0;
        int ans= 0;
        int i=0;
        while(i<nums.length){
           if(nums[i]==1){
            if(i<nums.length-1){
                max++;
            }else{
                max++;
                ans=(max>ans)?max:ans;
            }
           }else{
            ans=(max>ans)?max:ans;
            max=0;
           }
           i++;
        }
        return ans;
    }
}