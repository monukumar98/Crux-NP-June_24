package Lec31;

import java.util.*;

public class Right_Side_View {
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
		int maximum_depth = 0;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer>  ll = new ArrayList<>();
			rightView(root, 1, ll);
			return ll;
			
		}

		public void rightView(TreeNode root, int curr_depth,List<Integer> ll) {
			if (root == null) {
				return;
			}
			if (curr_depth > maximum_depth) {
				ll.add(root.val);
				maximum_depth=curr_depth;

			}
			rightView(root.right, curr_depth + 1,ll);
			rightView(root.left, curr_depth + 1,ll);
		}
	}
}










