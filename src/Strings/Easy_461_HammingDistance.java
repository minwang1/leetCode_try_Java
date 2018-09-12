package Strings;


/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 �� x, y < 231.
Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ��   ��

The above arrows point to positions where the corresponding bits are different.*/
public class Easy_461_HammingDistance {
	/**
	 * ֪ʶ��
	 * 1.������ȡ����ͬ�����֡�
	 * 2.ʮ����ת���ɶ����ƣ����Ϊ1��������
	 * @param x
	 * @param y
	 * @return
	 */
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int res = 0;
        
        while(xor > 0 ){
            if (xor % 2 == 1){
                res++;
            }
            xor = xor / 2;
        }
        return res;
    }
    
    public int hammingDistance2(int x, int y) {
        int res=x^y;
        int count=0;
        while(res>0)
        {
        	//&1����ȡ��ĩλΪ1������
            count+=res&1;
            //�Լ�1
            res=res>>1;
        }
        //����ĩλΪ1�Ĵ�����
       return count; 
    }
}
