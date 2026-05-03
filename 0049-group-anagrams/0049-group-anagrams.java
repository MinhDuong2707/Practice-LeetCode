class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        String[] str = new String[strs.length];
        for(int a =0; a<strs.length; a++){
            char[] chars = strs[a].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            str[a]= sorted;

        }
        for(int i =0; i<strs.length; i++){
            List<String> list = map.getOrDefault(str[i], new ArrayList<>());
            list.add(strs[i]);
            map.put(str[i], list);

        }
        List<List<String>> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
        
        
    }
}