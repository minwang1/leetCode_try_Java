package Tree;

/*Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13*/
public class Easy_538ConvertBSTtoGreaterTree {

	int sum;

	//因为BST特性，左子树的永远需要加父节点和右子树的值，父节点永远需要加上右子节点的值，右子节点永远不用改变。
	//所以通过递归调用访问，右子树，左子树。
	public TreeNode convertBST(TreeNode root) {
		if (root != null) {
			convertBST(root.right);
			sum += root.val;
			root.val = sum;
			convertBST(root.left);
		}
		return root;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
