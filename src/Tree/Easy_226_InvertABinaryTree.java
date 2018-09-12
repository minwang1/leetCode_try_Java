package Tree;

import Tree.Easy_617_MergeTwoBinaryTrees.TreeNode;


/*Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1*/
public class Easy_226_InvertABinaryTree {
	/*
	 * ¶Ô×óÓÒ×ÓÊ÷µÝ¹é·­×ª
	 */
	public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left = right;
        root.right = left;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
	
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}

}
