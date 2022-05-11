import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GameTree {

	/**
	 * Will you need any instance variables?
	 */
	private Node root;
	private Node curr;
	private String filename;
	private Scanner scan;
	private PrintWriter fileWrite;

	// TODO?

	/**
	 * Will you need to create an inner class? data string two nodes, one yes and
	 * one no constructors setter isQuestion addYes addNo
	 */
	// TODO?
	private class Node {
		String data;
		Node yes, no;

		public Node() {
			data = null;
			yes = no = null;
		}

		public Node(String val) {
			setVal(val);
			yes = null;
			no = null;
		}

		public void setVal(String val) {
			data = val;
		}

		public boolean isQuestion() {
			return data.contains("?");
		}

		public void addYes(Node idkwtfisgoingon) {
			yes = idkwtfisgoingon;
		}

		public void addNo(Node r) {
			no = r;
		}
	}

	/**
	 * Constructor needed to create the game.
	 *
	 * @param fileName this is the name of the file we need to import the game
	 *                 questions and answers from.
	 */
	public GameTree(String fileName) {

		this.filename = fileName;

		try {

			scan = new Scanner(new File(fileName));
			buildTree(root);

		} catch (FileNotFoundException s) {
			System.out.println("File does Not Exist Please Try Again: ");
		}
		// System.out.println(curr.data);
		curr = root;
	}

	/**
	 * builds the tree by determining if it is a
	 * 
	 * @param n
	 * @return
	 */
	private void buildTree(Node n) {

		String line = "";

		if (scan.hasNext())
			line = scan.nextLine().trim();

//		scan.close();

		if (root == null)
			root = n = new Node();

		if (line != null) {
			n.setVal(line);
		}

		if (n.isQuestion()) {
			n.yes = new Node();
			n.no = new Node();

			buildTree(n.yes);
			buildTree(n.no);
		}

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
	public void add(String newQ, String newA) {
//		Node temp = new Node(newQ);
//		temp.addYes(new Node(newA));
//		temp.addNo(curr);
//		curr.data = temp.data;
		String temp = curr.data;
		curr.data = newQ;
		curr.no = new Node(temp);
		curr.yes = new Node(newA);
	}

	/**
	 * True if getCurrent() returns an answer rather than a question.
	 *
	 * @return False if the current node is an internal node rather than an answer
	 *         at a leaf.
	 */
	public boolean foundAnswer() {
		return !curr.isQuestion();
			
	}

	/**
	 * Return the data for the current node, which could be a question or an answer.
	 * Current will change based on the users progress through the game.
	 *
	 * @return The current question or answer.
	 */
	public String getCurrent() {
		return curr.data;
	}

	/**
	 * Ask the game to update the current node by going left for Choice.yes or right
	 * for Choice.no Example code: theGame.playerSelected(Choice.Yes);
	 *
	 * @param yesOrNo
	 */
	public void playerSelected(Choice yesOrNo) {
		if (yesOrNo == Choice.Yes)
			curr = curr.yes;
		else if (yesOrNo == Choice.No)
			curr = curr.no;
	}

	/**
	 * Begin a game at the root of the tree. getCurrent should return the question
	 * at the root of this GameTree.
	 */
	public void reStart() {
		curr = root;
	}

	@Override
	public String toString() {
		return toString2("", root);

	}

	private String toString2(String dash, Node current) {
		if (current == null)
			return "";
		else {
			return toString2(dash + "-", current.no) + "\n" + dash + current.data + "\n"
					+ toString2(dash + "-", current.yes);
		}
	}

	/**
	 * Overwrite the old file for this gameTree with the current state that may have
	 * new questions added since the game started.
	 * 
	 * @throws IOException
	 *
	 */
	public void saveGame() throws IOException {
		try {
			fileWrite = new PrintWriter(new File(filename));

		} catch (FileNotFoundException e) {
			System.out.println("File not found uwu");
		}
		reWriteFile(root);
		fileWrite.close();
	}

	private void reWriteFile(Node node) {
		if (node == null)
			return;

		fileWrite.println(node.data);
		reWriteFile(node.yes);
		reWriteFile(node.no);
	}

}