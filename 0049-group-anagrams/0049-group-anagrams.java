class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap < String , List<String>> hm = new HashMap<>();

        for(String s:strs){
            int[] arr = new int[26];
            for(char c: s.toCharArray()){
            arr[ c - 'a']++;
                        }
            String key = Arrays.toString(arr);
            hm.putIfAbsent(key, new ArrayList<String>());
            hm.get(key).add(s);        }
        return new ArrayList<>(hm.values());
    }
}