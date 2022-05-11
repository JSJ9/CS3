import java.util.NoSuchElementException;

//An IntTree objects represents an entire binary tree of ints
public class SearchTree 
{
	private IntTreeNode overallRoot; //null for empty tree
	
	public void print()
	{
		print(overallRoot);
		System.out.println();
	}
	
	private void print(IntTreeNode root)
	{
		//base case in implicitly to do nothing null
		if(root != null)
		{
			//recursive case: print left, center, right
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}
	
	//Returns whether this tree contains the given integer
	public boolean contains(int n)
	{
		return contains(overallRoot,n);
	}
	
	
//	private boolean contains(int n, IntTreeNode node)
//	{
//		if(node == null)
//			return false; //base case
//		else if(node.data == n)
//			return true; //base case
//		else //recursive case: search left/right subtrees
//			return contains(n, node.left) || contains(n, node.right);
//		
//	}
	
	private boolean contains(IntTreeNode node, int value)
	{
		//reached the end of the tree
		if(node == null)
			return false;
		else if(node.data == value) //we check if we found the value
			return true;
		else if(node.data > value) //if it is greater we go left
			return contains(node.left, value);
		else 
			return contains(node.right, value);
	}
	
//	public void add(int value)
//	{
//		add(overallRoot, value);
//	}
//	
//	
	//Does not work
//	private void add(IntTreeNode node, int val)
//	{
//		if(node == null)
//			node = new IntTreeNode(val);
//		else if(node.data > val)
//			add(node.left, val);
//		else if(node.data < val)
//			add(node.right, val);
//		//else node.data == value
//		//it's duplicate (dont add)
//	}
	
	public void add(int val)
	{
		overallRoot = add(overallRoot, val);
	}
	
	private IntTreeNode add(IntTreeNode node, int value)
	{
		if(node == null)
			node = new IntTreeNode(value);
		else if(node.data > value)
			node.left = add(node.left, value);
		else if(node.data < value)
			node.right = add(node.right, value);
		//else a duplicate
		
		return node;
	}
	
	public int getMin()
	{
		if(overallRoot == null)
			throw new NoSuchElementException();
		
		return getMin(overallRoot);
	}
	
	private int getMin(IntTreeNode node)
	{
		if(node.left != null)
			return getMin(node.left);
		return node.data;
	}
}
