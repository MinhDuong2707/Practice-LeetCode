class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {Map<String, List<String>> map = new HashMap<>();
        String[] str = new String[strs.length];
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            str[i]=Arrays.toString(chars);
        }
        List<List<String>> listKQ= new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            List<String> list = map.getOrDefault(str[i], new ArrayList<>());
            list.add(strs[i]);
            map.put(str[i],list);
        }
        listKQ.addAll(map.values());
        return listKQ;
        
    }
}