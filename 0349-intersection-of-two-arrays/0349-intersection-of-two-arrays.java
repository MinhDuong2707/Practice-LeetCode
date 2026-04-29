class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();//Create a set to store nums1.
        Set<Integer> seta = new HashSet<>();//Create a set to save the results.
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