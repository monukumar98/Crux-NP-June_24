package Lec32;

public class Maximum_Sum_BST {

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
		public int maxSumBST(TreeNode root) {
			return isBST(root).ans;
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
			sbp.sum=lbp.sum+rbp.sum+root.val;
			sbp.isbst = lbp.isbst && rbp.isbst && rbp.min > root.val && lbp.max < root.val;
			if(sbp.isbst) {
				sbp.ans= Math.max(lbp.ans, Math.max(rbp.ans, sbp.sum));
			}
			else {
				sbp.ans= Math.max(lbp.ans,rbp.ans);
			}
			return sbp;

		}

		class BstPair {
			boolean isbst = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int sum = 0;
			int ans = 0;
		}
	}

}
