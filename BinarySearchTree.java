
public class BinarySearchTree {

	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	Node root;
	
	BinarySearchTree(){
		root=null;
	}
	
	void insert(int key){
		insertRec(root,key);
	}
	
	Node insertRec(Node root,int key){
		if(root==null){
			root=new Node(key);
			return root;
		}
		if(key<root.data){
			return insertRec(root.left,key);
		}else if(key>root.data){
			return insertRec(root.right,key);
		}else{
			return root;
		}	
	}
	
	void inorder()  {
	       inorderRec(root);
	}
	 
	void inorderRec(Node root) {
	    if (root != null) {
	       inorderRec(root.left);
	       System.out.println(root.data);
	       inorderRec(root.right);
	    }
	}
	 
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        tree.inorder();	
	}

}
