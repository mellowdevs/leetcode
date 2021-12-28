package Recursion1.PrincipleOfRecursion;

public class ReverseString {
    public void reverseString(char[] s) {
        if (s.length <= 1) return;
        helper(s, 0, s.length - 1);
        
    }
    
    public void helper(char[] s, int start, int end) {
        if (start >= end) return;
        swap(s, start, end);
        helper(s, start + 1, end - 1);
        
    }
    
    public void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    
}
