//An IntTreeNode object is one node in a binary tree of ints

public class IntTreeNode 
{
	int data; //Data stored at this node
	IntTreeNode left; //reference to the left subtree
	IntTreeNode right; //reference to the right subtree
	
	//Constructs a leaf node with the given data
	public IntTreeNode(int data)
	{
		this.data = data;
		right = null;
		left = null;
	}
	
	//Constructs a branch node with the given data and links
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right)
	{
		this.data = data;
		this.right = right;
		this.left = left;
	}
	
}
