package Nums;

import java.util.ArrayList;
import java.util.List;


/*Given an array of integers where 1 �� a[i] �� n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]*/
public class Easy_448FindAllNumbersInArray {


	/*�����ѷ�����һ�ֺ�����Ľⷨ��ȡ�����������ǣ���Ԫ�ض�Ӧ��λ��ȡ����
	��һ�仰���ܲ�����⣬���Ǿٸ����ӡ�������λ��k����Ԫ��i������ȡ
	���Ĺ�����i��ȡֵ�����ֿ��ܣ�Ϊ������ʾ��ǰ��δ����Ԫ��k����λ��ȡ��
	��Ϊ������ʾ��ǰ�Ѿ���Ԫ��k���֣�����Ԫ��ȡ�����������ǲ�����k������
	����Ԫ��i��Ԫ��i��Ȼ���֣����ǾͿ�һ��λ��i��Ϊ������ʾ����Ԫ��i��һ�γ�
	�֣����ǽ�λ��iȡ����Ϊ������ʾԪ��i�Ѿ����ֹ�һ�Σ����ǲ����κβ�����
	����һ��Ԫ�س���һ�λ������Σ�ֻҪ��������Ӧ��λ�þͻᱻȡ������ĳ��
	Ԫ�ز����ֵ�ʱ�򣬸�Ԫ�ض�Ӧ��λ��ʼ�շ��ʲ��������Ի�����ֵ��ͨ����
	�ַ������ǾͿ����ҵ���ЩԪ��û�г��֡�*/ 
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        //�ѷ��ʵ�������Ӧ�±�����ȡ����������ֵ>0˵����λ��û�����ʹ����Ѹ�λ�ü���res��
        for(int i = 0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }         
        }
        
        for(int i=0; i<nums.length;i++){
            if(nums[i] > 0){
                res.add(i + 1);
            }
        }
        return res;
    }

}
