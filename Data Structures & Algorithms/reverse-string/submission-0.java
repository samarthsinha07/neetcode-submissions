class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        
        while(i < j) {
            // Swap the characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            // Move the pointers (MUST be inside the loop)
            i++;
            j--;
        }
    }
}