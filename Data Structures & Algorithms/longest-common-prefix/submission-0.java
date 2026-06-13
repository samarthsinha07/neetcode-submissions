class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];// prefix declaration
        for(int i=1; i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){//condition to check prefix
                prefix= prefix.substring(0, prefix.length()-1);//shortens the string by eliminating the last character giving prefix 
            }
        }
        return prefix;
    }
}