class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        // Append to each string length and delimiter
        for(String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();

        int i = 0;
        // Iterating through whole string
        while(i < str.length()) {
            // Set start point
            int j = i;
            // Find delimiter position
            while(str.charAt(j) != '#') {
                j++;
            }

            // 'Cut' the length from encoded string
            int length = Integer.parseInt(str.substring(i, j));

            // Set next pointer as a begining of the word
            i = j + 1;
            // Add found word to array
            result.add(str.substring(i, i + length));
            // Move pointer to the next part of the encoded string
            i += length;
        }
        return result;
    }
}
