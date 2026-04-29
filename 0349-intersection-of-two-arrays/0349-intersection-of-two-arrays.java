class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> seta = new HashSet<>();
        for(int a:nums1){
            set.add(a);
        }
        for(int a: nums2){
            if(set.contains(a)){
                seta.add(a);
            }
        }
        int[] arr = new int[seta.size()];
        int i=0;
        for(int a:seta){
            arr[i++]=a;
        }
        return arr;

        
    }
}