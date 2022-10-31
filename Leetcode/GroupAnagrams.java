//https://leetcode.com/problems/group-anagrams/
class GroupAnagrams {
    /*
    Hashing
    Time complexity - o(n*m) where m - max length of string
    Space complexity - o(n)
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> resultanatMap = new HashMap<>();
        for(String s:strs){
            char[] alphaCount = new char[26];
            for(int i=0;i<s.length();i++){
                alphaCount[s.charAt(i) - 'a']++;
            }
            String alphaCountString = String.valueOf(alphaCount);
            resultanatMap.computeIfAbsent(alphaCountString, k->new ArrayList<>());
            resultanatMap.get(alphaCountString).add(s);
        }

        result.addAll(resultanatMap.values());
        return result;
    }
}
