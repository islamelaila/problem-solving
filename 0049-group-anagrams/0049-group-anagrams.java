class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map = new HashMap<>();

        for (String word : strs){
            char[] xArray = word.toCharArray();
            Arrays.sort(xArray);
            String sortedword = new String(xArray);

            if (!map.containsKey(sortedword)) {
                map.put(sortedword, new ArrayList<>());
            }

            map.get(sortedword).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
