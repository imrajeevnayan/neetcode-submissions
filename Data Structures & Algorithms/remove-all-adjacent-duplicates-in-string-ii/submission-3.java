public class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!charStack.isEmpty() &&
                charStack.peek() == ch) {
                charStack.push(ch);
                countStack.push(countStack.peek() + 1);
            } else {
                charStack.push(ch);
                countStack.push(1);
            }
            if (countStack.peek() == k) {
                for (int i = 0; i < k; i++) {
                    charStack.pop();
                    countStack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char ch : charStack) {
            sb.append(ch);
        }

        return sb.toString();
    }
}