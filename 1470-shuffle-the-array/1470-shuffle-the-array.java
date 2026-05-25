class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i=0;
        int j=n;
        int k=0;
        while(k<nums.length){
            if(k%2==0){
            ans[k]=nums[i];
            i++;
            }else{
            ans[k]=nums[j];
            j++;
            }
            k++;
        }
        return ans;
    }
}