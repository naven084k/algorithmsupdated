package com.learn.geeks.tree;

import com.learn.geeks.Utils;

public class PostOrderWithoutMemory {

	public static void main(String[] args) {
		morrisPostorderTraversal(Utils.getTree());

	}

	static void morrisPostorderTraversal(Node root){
		 
		// Making our tree left subtree of a dummy Node
		Node dummyRoot = new Node(0);
		dummyRoot.left = root;
		
		//Think of P as the current node 
		Node p = dummyRoot, pred=null, first=null, middle=null, last=null;
		while(p!=null){		
			
			if(p.left == null){
				p = p.right;
			} else{
				/* p has a left child => it also has a predeccessor
				   make p as right child predeccessor of p	
				*/
				pred = p.left;
				while(pred.right!=null && pred.right != p){
					pred = pred.right;
				}
				
				if(pred.right == null){ 
	 
					// predeccessor found for first time
					// modify the tree
					
					pred.right = p;	
					p = p.left;
				
				}else { 						 
				
				   // predeccessor found second time
				   // reverse the right references in chain from pred to p
					first = p;
					middle = p.left;  			
					while(middle!=p){			
						last = middle.right;
						middle.right = first;
						first = middle;
						middle = last;
					}
					
					// visit the nodes from pred to p
					// again reverse the right references from pred to p	
					first = p;
					middle = pred;
					while(middle!=p){
						
						System.out.print(middle.value+" ");  
						last = middle.right;	  	
						middle.right = first;
						first = middle;
						middle = last;
					}
					
					// remove the pred to node reference to restore the tree structure
					pred.right = null;	
					p = p. right;
				}
			}
		}	
	}
}
