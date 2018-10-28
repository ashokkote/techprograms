package com.kote.tech.collections;

public class LowestCommonAncestor {
	
	
	public static Node lcaRecursive(Node root, int v1, int v2) {
      	
        if(root == null || root.data == v1 || root.data == v2){
            return root;
        }
        
        Node left = lcaRecursive(root.left, v1, v2);
        Node right = lcaRecursive(root.right, v1, v2);

        return root.left == null ? root.right : (root.right == null ? root.left : root);
    }
	
	public static Node lcaNonRecursive(Node root, int v1, int v2) {
      	
		Node currNode = root;
		
       while(true) {
    	   
    	   if(currNode==null) {
    		   break;
    	   }
    	   
    	   if ((currNode.data >= v1 && currNode.data <= v2) ||
    		        (currNode.data <= v1 && currNode.data >= v2)) {
    		        break;  // current node is the common ancestor, as node1 and node2 
    		                // will go to different sub-tree
    		    } else if (currNode.data > v1) {
    		    	currNode = currNode.left;
    		    } else { // currentNode < node1/2
    		    	currNode = currNode.right;
    		    }
    	   
       }
       
       return currNode;

      
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	public static void main(String[] args) {
		
		Node root = insert(null,4);
		
		insert(root,2);
		insert(root,3);
		insert(root,1);
		insert(root,7);
		insert(root,6);
		
		Node lcaNode = lcaRecursive(root,1,7);

		System.out.println("Lowest Common Ancestor = "+lcaNode.data);	
		
		root = insert(null,8);
		
		insert(root,8);
		insert(root,4);
		insert(root,9);
		insert(root,1);
		insert(root,2);
		insert(root,3);
		insert(root,6);
		insert(root,5);
		
		//lcaNode = lcaRecursive(root,1,2);

		//System.out.println("Lowest Common Ancestor Recursive = "+lcaNode.data);	
		
		lcaNode = lcaNonRecursive(root,1,2);

		System.out.println("Lowest Common Ancestor Non-Recursive= "+lcaNode.data);
	
	}


}
