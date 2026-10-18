class Solution {
    public boolean isPalindrome(String s) {

        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        // Store valid characters in the stack
        for (int i = 0; i < array.length; i++) {

            char c = Character.toLowerCase(array[i]);

            if (Character.isLetterOrDigit(c)) {
                stack.push(c);
            }
        }

        // Compare characters with the stack
        for (int i = 0; i < array.length; i++) {

            char c = Character.toLowerCase(array[i]);

            if (Character.isLetterOrDigit(c)) {

                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}