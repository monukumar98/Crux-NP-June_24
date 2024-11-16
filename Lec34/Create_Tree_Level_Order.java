package Lec34;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Level_Order {

	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Tree_Level_Order() {
		// TODO Auto-generated constructor stub
		CreateTree();
	}

	private void CreateTree() {
		// TODO Auto-generated method stub
		int x = sc.nextInt();
		Node nn = new Node();
		nn.val = x;
		root = nn;
		Queue<Node> q= new LinkedList<>();
		q.add(nn);
		while(!q.isEmpty()) {
			Node n= q.poll();
			int c1 =sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node left = new Node();
				left.val=c1;
				n.left=left;
				q.add(left);
				
				
			}
			if(c2!=-1) {
				Node right = new Node();
				right.val=c2;
				n.right=right;
				q.add(right);
			}
		}

	}

	Scanner sc = new Scanner(System.in);
}
















