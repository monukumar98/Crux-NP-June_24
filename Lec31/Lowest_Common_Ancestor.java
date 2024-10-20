package Lec31;

public class Lowest_Common_Ancestor {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
			return LCA(root, p, q);
		}

		public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
			if (root == null) {
				return null;
			}

			if (root == p || root == q) {
				return root;
			}
			TreeNode left = LCA(root.left, p, q);
			TreeNode right = LCA(root.right, p, q);
			if (left != null && right != null) {
				return root;
			} else if (left == null) {
				return right;
			} else {
				return left;
			}

		}
	}
}
