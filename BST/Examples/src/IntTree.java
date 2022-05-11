//An IntTree objects represents an entire binary tree of ints
public class IntTree 
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
		return contains (n, overallRoot);
	}
	
	private boolean contains(int n, IntTreeNode node)
	{
		
		if(node == null)
			return false; //base case
		else if(node.data == n)
			return true; //base case
		else //recursive case: search left/right subtrees
			return contains(n, node.left) || contains(n, node.right);
		
	}
	
}
