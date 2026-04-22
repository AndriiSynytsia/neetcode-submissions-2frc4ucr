class Solution {
    public boolean isValid(String s) {
        // Using stack because this problem represents the structure of LIFO (last in first out)
        Stack<Character> stack = new Stack<>();

        // Creating the map to reffer to the opened parentheses
        Map<Character, Character> table = new HashMap<>();
        table.put(')', '(');
        table.put('}', '{');
        table.put(']', '[');

        // Iterating a sequence of chars using string with toCharArray method
        for(char c : s.toCharArray()) {
            // 1 Check - verify the parentheses for existing in table(map)
            if(table.containsKey(c)) {
                // 2 Check - verify the matching parentheses in map and the last pushed item in stack - ADDITIONAL - check for empty stack
                if(!stack.isEmpty() && stack.peek() == table.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
