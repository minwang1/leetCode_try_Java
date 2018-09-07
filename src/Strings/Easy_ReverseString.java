package Strings;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * Example 1:
 * Input: "hello"
 * Output: "olleh"
 * Example 2:
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: "amanaP :lanac a ,nalp a ,nam A"
 * @author min
 *
 */
public class Easy_ReverseString {
	
    //method 2: use swap method
    public String reverseString(String s){
        if(s == null || s.length() == 0)
            return "";
        char[] cs = s.toCharArray();
        int begin = 0, end = s.length() - 1;
        while(begin <= end){
            char c = cs[begin];
            cs[begin] = cs[end];
            cs[end] = c;
            begin++;
            end--;
        }
        
        return new String(cs);
    }
    
    /**
     * my submission. more easier new StringBuilder.reverse().toString();
     * @param s
     * @return
     */
    /*public String reverseString(String s) {
        char[] tmp = new char[s.length()];
        
        for(int i=0; i<s.length();i++){
            tmp[i] = s.charAt(i);            
        }
        StringBuilder sb = new StringBuilder();
        for(int j=tmp.length-1; j>-1; j--){
            sb.append(tmp[j]);
        }
        return sb.toString();
    }*/

}
