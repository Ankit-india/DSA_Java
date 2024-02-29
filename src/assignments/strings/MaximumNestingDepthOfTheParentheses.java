package src.assignments.strings;

class MaximumNestingDepthOfTheParentheses {
    // https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
    public int maxDepth(String s) {
        int o = 0;
        int ans = 0;
        for(char x: s.toCharArray()) {
            if(x == ')') {
                o--;
            }
            else if(x == '(') {
                o++;
            }
            ans = Math.max(ans, o);
        }
        return ans;
    }
}