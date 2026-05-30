class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int s: nums){
            set.add(s);
        }
        int i=1;
        while(i<=nums.length){
            if(!set.contains(i)){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}