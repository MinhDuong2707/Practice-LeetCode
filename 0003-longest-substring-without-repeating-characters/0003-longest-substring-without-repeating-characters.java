class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxPoint=0;
        int j=0;
        for(int i=0; i<s.length(); i++){
            char a= s.charAt(i);
            if(map.containsKey(a)&&map.get(a)>=j){
                j=1+map.get(a);
            }
            map.put(a,i);
            maxPoint= Math.max(maxPoint, i-j+1);
        }
        return maxPoint;
        
    }
}