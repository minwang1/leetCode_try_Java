package Strings;


/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.
Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.*/
public class Easy_461_HammingDistance {
	/**
	 * 知识点
	 * 1.异或操作取出不同的数字。
	 * 2.十进制转换成二进制，算出为1的数量。
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
        	//&1可以取出末位为1的数。
            count+=res&1;
            //自减1
            res=res>>1;
        }
        //返回末位为1的次数。
       return count; 
    }
}
