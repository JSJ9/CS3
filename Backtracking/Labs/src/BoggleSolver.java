import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BoggleSolver
{
	private Set<String> dictionary;
	
	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A - Z.)
	public BoggleSolver(String dictionaryName) throws IOException
	{
		Scanner scan = new Scanner(new File(dictionaryName));
		dictionary = new HashSet<String>();
		while(scan.hasNext())
		{
			String w = scan.next();
			dictionary.add(w);
		}
	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable object
	public Iterable<String> getAllValidWords(BoggleBoard board)
	{
		//TODO
		ArrayList<String> words = new ArrayList<String>();
		return killMeNowUwu(words, 0, 0);
	}
	
	/**
	 * goes to each square and determines if it makes a word. If it does, we add to the
	 * dictionary. We move on to every other index as long as it is within the 2D array.
	 * @param words
	 * @param x
	 * @param y
	 * @return
	 */
	private ArrayList<String> killMeNowUwu(ArrayList<String> words, int x, int y)
	{
		ArrayList<String> uwu = new ArrayList<String>();
		uwu.add("owo");
		return uwu;
	}

	private boolean inBounds(int r, int c, BoggleBoard b)
	{
		return (r >= 0 && r <= b.rows()) && (c >= 0 && c <= b.cols());
	}
	
	
	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A - Z.)
	public int scoreOf(String word)
	{
		int score = 0;
		if(inDictionary(word))
		{
			if(word.length() >= 0 || word.length() <= 2)
				score = 0;
			else if(word.length() == 3 || word.length() == 2)
				score = 1;
			else if(word.length() == 5)
				score = 2;
			else if(word.length() == 6)
				score = 3;
			else if(word.length() == 7)
				score = 5;
			else if(word.length() >= 8)
				score = 11;
		}

		return score;
	}
	
	private boolean inDictionary(String w)
	{
		return dictionary.contains(w);
	}

	public static void main(String[] args) throws IOException {
		System.out.println("WORKING");

		final String PATH   = "./data/";
		BoggleBoard  board  = new BoggleBoard("board-q.txt");
		BoggleSolver solver = new BoggleSolver("dictionary-algs4.txt");
		System.out.println(board.toString());
		int totalPoints = 0;

		for (String s : solver.getAllValidWords(board)) {
			System.out.println(s + ", points = " + solver.scoreOf(s));
			totalPoints += solver.scoreOf(s);
		}

		System.out.println("Score = " + totalPoints); //should print 84

		//new BoggleGame(4, 4);
	}

}
