package Nums;

/*Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum �� s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.*/
public class MinimumSizeSubarraySum {
	/**
	 * ˼·��1.ά��һ�����ڣ�������start��end�����߽硣
	 * 2.��sum<s��ʱ�򣬲������󴰿�(end����)����sum>=s��ʱ�򣬴�ʱ��Ҫ��С���ڱ߽磬��������С���ȡ�
	 * 3.��start�ִ�����߽�ʱ��ֹͣ������
	 * @param s
	 * @param nums
	 * @return
	 */
	public int minSubArrayLen(int s, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum =0;
        
        int i=0;
        int start=0;
        int end=0;
        while(start<nums.length){
            if(sum < s && end<nums.length){
                sum += nums[end++];
            }else if(sum >= s){
                minLen = Math.min(minLen, end - start);
                sum-=nums[start++];
            }else{
                break;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
