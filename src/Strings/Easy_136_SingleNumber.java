package Strings;

import java.util.HashMap;
import java.util.Map;
/*Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4*/
public class Easy_136_SingleNumber {
	/**we use bitwise XOR to solve this problem :

		first , we have to know the bitwise XOR in java

		0 ^ N = N
		N ^ N = 0
		So..... if N is the single number
		N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
		= (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
		= 0 ^ 0 ^ ..........^ 0 ^ N
		= N
	**/
	public int singleNumber(int[] nums) {
	    int ans =0;
	    
	    int len = nums.length;
	    for(int i=0;i!=len;i++)
	        ans ^= nums[i];
	    
	    return ans;	    
	}
	
	
	/**
	 * map too slow XD
	 * @param nums
	 * @return
	 */
	/*public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
       
        for(int i =0; i<nums.length; i++){
            if (map.get(nums[i]) != null){
                map.put(nums[i], 2);
            } else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
        
    }*/
}


