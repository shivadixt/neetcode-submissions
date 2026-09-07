class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        ArrayList<ArrayList<String>> ls = new ArrayList<ArrayList<String>>();
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);            
        }
        return new ArrayList<>(map.values());
    }
}
