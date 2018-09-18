package Nums;

import java.util.ArrayList;
import java.util.List;

/*Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.


In Pascal's triangle, each number is the sum of the two numbers directly above it.
Example:

Input: 3
Output: [1,3,3,1]
*/public class PascalsTriangle2 {
	/*
	 * 思路：根据杨辉三角的特性，每行先在末位添加1，新length-2位置 = 原来length-1位置+原来length的值。
	 */
	public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList();
        for(int i=0;i<=rowIndex;i++){
            res.add(1);
            for(int j=i-1;j>0;j--){
                res.set(j, res.get(j)+res.get(j-1));
            }
        }
        return res;
        
    }
}
