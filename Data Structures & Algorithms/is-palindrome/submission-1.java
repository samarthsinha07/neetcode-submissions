class Solution {
    public boolean isPalindrome(String s) {
           if (s.isEmpty()){
            return true;
           }
           // start element 
           int start =0;// start pointer 
           int last =s.length()-1; // last pointer 
           while (start <=last){
            char currFirst = s.charAt(start);//checking through iterations 
             char currLast = s.charAt(last);// checking till last 
             if (!Character.isLetterOrDigit(currFirst )) {
        		start++;// iterate
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;//till last 
        	} else {// given condition
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}
//*Approach
// Use **two pointers**, one at the start and one at the end of the string.
// Move both pointers inward while comparing characters.
//Ignore spaces, punctuation, and capitalization** while comparing.
// If any valid characters mismatch → `false`; otherwise → `true`.
