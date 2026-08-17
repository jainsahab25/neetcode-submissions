class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        String s2="";

        char[] c = s.toCharArray();
        for(char ch : c){
        if(Character.isLetterOrDigit(ch))
        {
            s2=s2+ch;
        }
        }

        for(int i = c.length-1;i>=0;i--){
            if(Character.isLetterOrDigit(c[i])){
                s1=s1+c[i];
            }

            if(s1.equalsIgnoreCase(s2)){
                return true;
            }
        }
       return false;
    }
}
