package Lec34;

public class Construc_Binary_Tree_from_Preorder_and_Inorder_Traversal {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

		}

		public TreeNode CreateTree(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode nn = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int c = idx - ilo;
			nn.left = CreateTree(pre, in, plo + 1, plo + c, ilo, idx - 1);
			nn.right = CreateTree(pre, in, plo + c + 1, phi, idx + 1, ihi);
			return nn;
		}

		public int search(int[] in, int ilo, int ihi, int item) {

			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}

}
