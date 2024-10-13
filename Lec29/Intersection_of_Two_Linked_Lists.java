package Lec29;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

			ListNode vgf = headA;
			ListNode lal_chasma = headB;
			while (vgf != lal_chasma) {
				if (vgf == null) {
					vgf = headB;
				} else {
					vgf = vgf.next;
				}
				if (lal_chasma == null) {
					lal_chasma = headA;
				} else {
					lal_chasma = lal_chasma.next;
				}
			}
			return vgf;

		}
	}
}
