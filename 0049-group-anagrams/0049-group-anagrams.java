class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String SortedS = new String(charArray);
        hm.putIfAbsent(SortedS,new ArrayList<>());
        hm.get(SortedS).add(s);
        }
    return new ArrayList<>(hm.values());

    }
}