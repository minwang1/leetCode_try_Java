package Strings;

/*Given an input string, reverse the string word by word.

Example:  

Input: "the sky is blue",
Output: "blue is sky the".
Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
Follow up: For C programmers, try to solve it in-place in O(1) space.*/
public class Mediu151ReverseWordsInAString {
	public String reverseWords(String s) {
        String[] tmps = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        
        // 注意 ""," 1"字符串的情况。""生成一个 [""]数组。" 1"会生成一个长度为2的数组[""] [1]。
        for(int i = tmps.length -1; i> -1; i--){
	            if(tmps.length == 0 || tmps[i].equals(" ") || tmps[i].equals("")){            	
	                continue;
	            }
	            
	            if(i == tmps.length -1){
	            	sb.append(tmps[i]);
	            } else{
	            	sb.append(" "+tmps[i]);
	            }
	        }
        return sb.toString();   
    }
	
	
	/*Now there could be three possibilities:

		The input is empty: "", parts will contain [""]. The for loop is skipped and "" + "" is returned.
		The input contains only one part: "a", parts will contain ["a"]. The for loop is skipped and "" + "a" is returned.
		The input contains multiple parts: "a b c", reverse the order of all but the first part: "c b " in the for loop and return "c b " + "a".*/
	/*String[] parts = s.trim().split("\\s+");
	String out = "";
	for (int i = parts.length - 1; i > 0; i--) {
	    out += parts[i] + " ";
	}
	return out + parts[0];*/

}
