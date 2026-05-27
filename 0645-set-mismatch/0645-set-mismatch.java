class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num)==2){
                ans[0]=num;
            }
        }
        int i=1;
        while(i<=nums.length){
            if(!map.containsKey(i)){
                ans[1]=i;
            }
            i++;
        }
        return ans;
    }    
}