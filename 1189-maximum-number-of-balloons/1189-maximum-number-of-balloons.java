class Solution {
    public int maxNumberOfBalloons(String text) {
        String value = "balloon";
        Map<Character,Integer> mapT = new HashMap<>();
        for(int i =0; i<text.length();i++){
            mapT.put(text.charAt(i), mapT.getOrDefault(text.charAt(i), 0) + 1);
        }
        int result = Math.min(mapT.getOrDefault('b', 0),
             Math.min(mapT.getOrDefault('a', 0),
             Math.min(mapT.getOrDefault('l', 0) / 2,
             Math.min(mapT.getOrDefault('o', 0) / 2,
                      mapT.getOrDefault('n', 0)))));
        return result;
        
        


    }
}