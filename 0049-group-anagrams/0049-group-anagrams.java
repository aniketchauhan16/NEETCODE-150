class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap < String , List<String>> hm = new HashMap<>();

        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hm.putIfAbsent(sortedS,new ArrayList<>());
            hm.get(sortedS).add(s) ;
        }
        return new ArrayList<>(hm.values());
    }
}