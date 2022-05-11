import java.util.Iterator;
import java.util.Stack;

public class MyBST
{

	private BSTNode root; /** The root node of the binary tree **/

	/**
	 * The public method that returns the size of the binary tree
	 * 
	 * @return - number of nodes of a binary tree
	 */
	public int size()
	{
		return size(root);
	}

	/**
	 * called by the public method size() This method does the actual work by
	 * counting the number of nodes in the binary tree and calls the method
	 * recursively
	 * 
	 * @param r - the root of the binary tree
	 * @return - the total number of nodes in the binary tree
	 */
	private int size(BSTNode r)
	{
		if (r == null)
			return 0;
		else
			return 1 + size(r.left) + size(r.right);
	}

	/**
	 * Calls the private method insert Adds a node to the binary tree
	 * 
	 * @param n - the value we want to insert in the binary tree
	 */
	public void insert(Integer n)
	{
		root = insert(root, n);
	}

	/**
	 * Called by the public method insert Determines where we can insert the new
	 * value based on comparison if the value is smaller than the node it goes left,
	 * else go right
	 * 
	 * @param node  - the root node of the binary tree
	 * @param value - the value we want to add
	 * @return - returns the node that was added to the tree
	 */
	private BSTNode insert(BSTNode node, Integer value)
	{
		if (node == null)
			node = new BSTNode(value);
		else if (value < node.val)
			node.left = insert(node.left, value);
		else if (value > node.val)
			node.right = insert(node.right, value);

		return node;
	}

	/**
	 * Calls the private method contains Checks if the parameter is inside of the
	 * tree
	 * 
	 * @param n - the value we are looking for
	 * @return - true if it is in the tree, false otherwise
	 */
	public boolean contains(Integer n)
	{
		return contains(root, n);
	}

	/**
	 * Called by public contains method Takes in the value and checks if any of the
	 * node values are equal
	 * 
	 * @param r   - the root node of the binary tree
	 * @param val - the value we are checking if it is in the tree
	 * @return - true if it is in the tree, false otherwise
	 */
	private boolean contains(BSTNode r, Integer val)
	{
		if (r == null)
			return false;
		else if (r.val == val)
			return true;
		else if (val < r.val)
			return contains(r.left, val);
		else
			return contains(r.right, val);
	}

	/**
	 * Calls the private method getMax()
	 * 
	 * @return - the largest value in the binary tree
	 */
	public Integer getMax()
	{
		return getMax(root);
	}

	/**
	 * Called by the public method getMax() Goes to the rightmost node in the binary
	 * tree
	 * 
	 * @param n - the root node of the tree
	 * @return - the rightmost value in the binary tree
	 */
	private Integer getMax(BSTNode n)
	{
		if (n.right != null)
			return getMax(n.right);

		return n.val;
	}

	/**
	 * Calls the private method getMin(n)
	 * 
	 * @return - the smallest value in the tree
	 */
	public Integer getMin()
	{
		return getMin(root);
	}

	/**
	 * Goes to the leftmost node in the binary tree
	 * 
	 * @param n - the root node
	 * @return - the value of the leftmost node
	 */
	private Integer getMin(BSTNode n)
	{
		if (n.left != null)
			return getMin(n.left);

		return n.val;
	}

	/**
	 * Calls the private method delete(node, n)
	 * @param n	- the value we want to remove from the tree
	 */
	public void delete(Integer n)
	{
		if (contains(root, n))
			root = delete(root, n);
	}

	/**
	 * Gets called by the public method delete(int n)
	 * Looks for the value and when it finds it, it removes the value by skipping the value
	 * if it has a child then it finds the least value and then sets that value to the 
	 * node we found.
	 * @param node	- the root node of tree
	 * @param n		- the value we are looking for
	 * @return		- returns the node we are removing
	 */
	private BSTNode delete(BSTNode node, Integer n)
	{
		if (node == null)
			return null;
		else if (n > node.val)
			node.right =  delete(node.right, n);
		else if (n < node.val)
			node.left = delete(node.left, n);
		else if (n == node.val)
		{
			if (node.right == null)
				return node.left;
			else if (node.left == null)
				return node.right;
			else
			{
				node.val = getMin(node.right);
				node.right = delete(node.right, node.val);
			}
		}

		return node;

	}

	/**
	 * prints out the binary tree in a tree like way
	 */
	public void print()
	{
		Stack<Integer> stck = new Stack<Integer>();
		int lvl = 0;
		stck = print(root, stck, lvl);

		while(!stck.isEmpty())
		{
			int spaces = stck.pop();
			for (int x = 0; x < spaces; x++)
				System.out.print("\t");
			int val = stck.pop();
			System.out.print(val + "\n");
		}
	}

	/**
	 * Takes in the values of the nodes, and stores it into a stack that will be used
	 * in the public print method
	 * @param node	- the root node of the binary tree
	 * @param stck	- the stack we are adding to
	 * @param level	- the level in the binary tree
	 * @return		- the stack that contains the node values and the levels
	 */
	private Stack<Integer> print(BSTNode node, Stack<Integer> stck, int level)
	{
		if (node == null)
			return null;
		
		print(node.left, stck, level + 1);
		stck.push(node.val);
		stck.push(level);
		
		print(node.right, stck, level+1);

		return stck;
	}

	/**
	 * calls the private method in order and prints out the tree from the leftmost
	 * to the root.
	 */
	public void inOrder()
	{
		Stack<Integer> s = new Stack<Integer>();

		System.out.println(inOrder(root, s));
	}

	/**
	 * private method called by the public method inOrder() prints out the binary
	 * tree from the leftmost node to the root
	 * 
	 * @param node - the root of the binary tree
	 * @param stck - the stack we are adding the value to
	 * @return - the stack that holds the node values.
	 */
	private Stack<Integer> inOrder(BSTNode node, Stack<Integer> stck)
	{
		if (node == null)
			return null;
		else
		{
			inOrder(node.left, stck);
			stck.push(node.val);
			inOrder(node.right, stck);
		}

		return stck;
	}

	/**
	 * Private class that takes care of the nodes of the tree
	 */
	private class BSTNode
	{
		Integer val;
		BSTNode left, right;

		public BSTNode(Integer val)
		{
			this.val = val;
			left = right = null;
		}

		@Override
		public String toString()
		{
			return "" + this.val;
		}
	}
}
