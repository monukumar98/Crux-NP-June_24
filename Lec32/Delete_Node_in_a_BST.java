package Lec32;

public class Delete_Node_in_a_BST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}
			if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else {
				// 1 or 0 child ke liye hai
				if (root.right == null) {
					return root.left;
				} else if (root.left == null) {
					return root.right;
				} else {
					int min = Min(root.right);// 11
					root.right = deleteNode(root.right, min);// 11
					root.val = min;
				}
			}
			return root;
		}

		public int Min(TreeNode root) {
			if (root == null) {
				return Integer.MAX_VALUE;
			}
			int lmin = Min(root.left);
			return Math.min(lmin, root.val);
		}
	}

}
