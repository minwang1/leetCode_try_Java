package Strings;

/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 * @author min
 *
 */
public class Easy_ToLowerCase {
	public String toLowerCase(String str) {
        char[] tmp = str.toCharArray();
        int dis = (int)'a' - (int)'A';
        
        for(int i=0; i< tmp.length ;i++){
            if('A' <= tmp[i] && tmp[i] <= 'Z'){
                tmp[i] = (char)(tmp[i] + dis);
            }
        }
 
        return new String(tmp);
    }
}
