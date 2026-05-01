class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList();
        }

        Map<String, List> hashedStrs = new HashMap();

        int[] count = new int[26];

        for(String s : strs) {
            // Reset count for each hash
            Arrays.fill(count, 0);

            for(char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            
            for(int i = 0; i < count.length; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if(!hashedStrs.containsKey(key)) {
                hashedStrs.put(key, new ArrayList());
            }

            hashedStrs.get(key).add(s);
        }

        return new ArrayList(hashedStrs.values());
    }
}
