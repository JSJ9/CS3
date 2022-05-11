import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameTree
{

	/**
	 * Will you need any instance variables?
	 */
	private Node root;
	private Node curr;
		//TODO?
	
	/**
	 * Will you need to create an inner class?
	 * data string
	 * two nodes, one yes and one no
	 * constructors
	 * setter
	 * isQuestion
	 * addYes
	 * addNo
	 */
		//TODO?
	private class Node
	{
		String data;
		Node yes, no;
		
		public Node()
		{
			data = null;
			yes = null;
			no = null;
		}
		
		public Node(String val)
		{
			data = val;
			yes = null;
			no = null;
		}
		
		public void setVal(String val)
		{
			data = val;
		}
		
		public boolean isQuestion()
		{
			return data.contains("?");
		}
		
		public void addYes(Node idkwtfisgoingon)
		{
			yes = idkwtfisgoingon;
		}
		
		public void addNo(Node r)
		{
			no = r;
		}
		
		@Override
		public String toString()
		{
			return data;
		}
	}

	/**
	 * Constructor needed to create the game.
	 *
	 * @param fileName this is the name of the file we need to import the game
	 *                 questions and answers from.
	 */
	public GameTree(String fileName)
	{

		try
		{
			Scanner scan = new Scanner(new File(fileName));
			
			while(scan.hasNextLine())
			{
				Node temp = new Node(scan.nextLine().trim()); //takes in the string, set to node
				buildTree(temp); //builds with new node
			}
			
			scan.close();
			
		} catch (FileNotFoundException s)
		{
			System.out.println("File does Not Exist Please Try Again: ");
		}
	}

	/**
	 * builds the tree by determining if it is a 
	 * @param n
	 * @return
	 */
	private Node buildTree(Node n)
	{
		if(root == null)
		{
			root = n;
		}
		if(n.data != null)
		{
			n.setVal(n.data);
		}
		if(n.isQuestion())
		{
			n.yes = new Node();
			n.no = new Node();
			
			buildTree(n.yes);
			buildTree(n.no);
		}
		
		return n;
		
	}
	/*
	 * Add a new question and answer to the currentNode. If the current node has the
	 * answer chicken, theGame.add("Does it swim?", "goose"); should change that
	 * node like this:
	 */
	// -----------Feathers?-----------------Feathers?------
	// -------------/----\------------------/-------\------
	// ------- chicken horse-----Does it swim?-----horse--
	// -----------------------------/------\---------------
	// --------------------------goose--chicken-----------
	/**
	 * @param newQ The question to add where the old answer was.
	 * @param newA The new Yes answer for the new question.
	 */
	public void add(String newQ, String newA)
	{
		Node temp = new Node(newQ);
		temp.addYes(new Node(newA));
		temp.addNo(curr.no);
		curr = temp;
	}

	/**
	 * True if getCurrent() returns an answer rather than a question.
	 *
	 * @return False if the current node is an internal node rather than an answer
	 *         at a leaf.
	 */
	public boolean foundAnswer()
	{
		if(!getCurrent().contains("?"))
			return true;
		
		return false; // replace
	}

	/**
	 * Return the data for the current node, which could be a question or an answer.
	 * Current will change based on the users progress through the game.
	 *
	 * @return The current question or answer.
	 */
	public String getCurrent()
	{
		return curr.toString();
	}

	/**
	 * Ask the game to update the current node by going left for Choice.yes or right
	 * for Choice.no Example code: theGame.playerSelected(Choice.Yes);
	 *
	 * @param yesOrNo
	 */
	public void playerSelected(Choice yesOrNo)
	{
		// TODO
		
		if(yesOrNo == Choice.No)
			root = root.yes;
		else if(yesOrNo.equals(Choice.Yes))
			root = root.no;
	}

	/**
	 * Begin a game at the root of the tree. getCurrent should return the question
	 * at the root of this GameTree.
	 */
	public void reStart()
	{
		curr = root;
	}

	@Override
	public String toString()
	{
		// TODO

		return "";
	}

	/**
	 * Overwrite the old file for this gameTree with the current state that may have
	 * new questions added since the game started.
	 *
	 */
	public void saveGame()
	{
		// TODO
	}
}
