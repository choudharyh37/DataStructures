
public class BinaryTree{
	Node root;
	
	BinaryTree(int data){
		root =new Node(data);
	}
	BinaryTree(){
		root=null;
	}
	//Traverse through binary tree
	void printPostOrder(Node node){
		if(node==null){
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.data+" ");
	}
	void printPreOrder(Node node){
		if(node==null){
			return;
		}
		System.out.println(node.data+" ");
		printPreOrder(node.left);
		printPreOrder(node.right);		
	}
	void printInOrder(Node node){
		if(node==null){
			return;
		}
		printInOrder(node.left);
		System.out.println(node.data+" ");
		printInOrder(node.right);
		
	}
	
	void printPost(){
		printPostOrder(root);
	}
	void printPre(){
		printPreOrder(root);
	}
	void printIn(){
		printInOrder(root);
	}
	
	public  static void main(String[] args){
		BinaryTree tree=new BinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("PreOrder:");
        tree.printPre();
        System.out.println("InOrder:");
        tree.printIn();
        System.out.println("PostOrder:");
        tree.printPost();
	}
}

public class Node {
	
	int data;
	Node left;
	Node right;
	
	Node(int d){
		data=d;
		left=right=null;
	}
}

