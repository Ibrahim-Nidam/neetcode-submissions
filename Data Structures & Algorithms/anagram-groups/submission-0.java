class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            char[] chArray = s.toCharArray();
            Arrays.sort(chArray);
            String sorted = new String(chArray);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
        }

        return new ArrayList<>(res.values());
        
    }
}
