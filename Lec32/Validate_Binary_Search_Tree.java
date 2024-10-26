package Lec32;

public class Validate_Binary_Search_Tree {
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
		public boolean isValidBST(TreeNode root) {
			return isBST(root).isbst;
		}

		public BstPair isBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = isBST(root.left);
			BstPair rbp = isBST(root.right);
			BstPair sbp = new BstPair();
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.isbst = lbp.isbst && rbp.isbst && rbp.min > root.val && lbp.max < root.val;
			return sbp;

		}

		class BstPair {
			boolean isbst = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
		}
	}

}
