class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        
        // Ghi số khác 0 vào đầu mảng
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        
        // Điền 0 vào phần còn lại
        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
    }
}