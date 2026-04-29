class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int a:nums1){
            for(int b: nums2){
                if(set.contains(b)||set.contains(a)){
                    continue;
                }
                if(a==b){
                    set.add(a);
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return arr;

        
    }
}