import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class WordChainHome {
	private String beginWord; //the first word in the game
	private String finalWord; //the word we want to get to at the end of the game
	private Queue<Stack<String>> wordChain; //queue that contains all of the stacks
	private HashSet<String> dictionary; //the dictionary that we are referencing from
	private Stack<String> wordStack; // you are making copies of this, stack that contains the beginning word

	/**
	 * Initializes all of the instance variables.
	 * 
	 * @throws IOException
	 */
	public WordChainHome() throws IOException {
		beginWord = "";
		finalWord = "";
		wordStack = new Stack<String>();
		wordChain = new LinkedList<Stack<String>>();
		dictionary = new HashSet<String>();
	}

	/**
	 * Calls the initializing constructor, but sets the begin and final word to the
	 * parameters. It also populates the current hashSet with all of the words in
	 * dictionary.
	 * 
	 * @param n - The beginning word parameter
	 * @param f - the final word parameter
	 * @throws IOException
	 */
	public WordChainHome(String n, String f) throws IOException {
		this();
		beginWord = n.toUpperCase();
		finalWord = f.toUpperCase();
		wordStack.push(beginWord);
		wordChain.offer(wordStack);
		populateDictionary();
	}

	/**
	 * @return the beginning word instance variable
	 */
	public String getBeginWord() {
		return this.beginWord;
	}

	/**
	 * @return the final word instance variable
	 */
	public String getFinalWord() {
		return this.finalWord;
	}

//	// this is for debugging purposes
//	public void getDictionary() {
//		for (String i : dictionary)
//			System.out.println(i);
//	}

	/**
	 * Checks if a value is inside of the dictionary.
	 * 
	 * @param word - the word we want to find in the dictionary
	 * @return - true if it is in the hash dictionary and false if it is not
	 */
	public boolean isInDict(String word) {
		
		return dictionary.contains(word.toUpperCase());
	}


	/**
	 * Take in the beginning word, make a new String that is the all uppercase
	 * version of the word. Go through each index of the string and then replace the
	 * current index of the string with a character between 65 and 122. If it is in
	 * the dictionary, then we make a clone of the stackk and add the word that we
	 * found and enqueue that stack to the wordChain and "return".
	 * 
	 * @param stackk -	the current stack of words
	 * @param bw	- the beginning word
	 */
	public boolean wordsOneLetterAway(String bw, Stack<String> idk) {


		String upperBw = bw.toUpperCase();

		for (int i = 0; i < bw.length(); i++) //goes through each letter
		{
			
			for (int x = 65; x < 97; x++) //A - Z
			{
				
				char[] characters = upperBw.toCharArray();
				characters[i] = (char) x;
				String temp = wordFromCharArray(characters); 

				if (isInDict(temp) && !temp.equals(upperBw)) 
				{
					Stack<String> s = (Stack<String>) idk.clone();
					s.push(temp);
					
					deleteFromDict(temp);

					wordChain.offer(s);

					if (temp.equals(finalWord)) {
						System.out.println("Found a ladder! >>>  " + s);
						return true;
					}
				}
			}
		}

		return false;
	}
	
	/**
	 * Deletes the specified value from the dictionary hash set
	 * @param word	- the word we want to remove
	 */
	public void deleteFromDict(String word)
	{
		dictionary.remove(word.toUpperCase());
	}

	/**
	 * Turns the character array into a string variable
	 * @param ray	- the char array
	 * @return	- the char array as a string
	 */
	public String wordFromCharArray(char[] ray) {
		String out = "";
		for (char i : ray)
			out += i + "";

		return out;
	}

	/**
	 * We take a temporary stack that is a copy of first stack in wordChain. We get the current
	 * word in the stack by peeking. We check if the first and second values are in the dictionary
	 * and if they match lengths. If they do not, then we return that there is no ladder. If it passes, 
	 * we then do a while loop for as long as the currentWord does NOT equal the final word or it is not null.
	 * While this is true, WOLA would be called. If false, we check if the queue is empty and if
	 * true, we return that there is no ladder. If false, we return the temporary
	 * stack, which would contain the ladder.
	 * 
	 * @return	- a string if it does have a ladder, if not it returns that there is not a ladder
	 */
	public String findStack() 
	{
		Stack<String> temp = wordChain.poll();
		String currWord = temp.peek();

		if (!isInDict(beginWord) || !isInDict(finalWord) || beginWord.length() != finalWord.length()) {
			return "There is no ladder between " + beginWord + " and " + finalWord + "\n";
		} else if (beginWord.equals(finalWord)) {

			return "Found a ladder! >>> " + temp;
		}

		while (!currWord.equals(finalWord) && currWord != null) {

			if (!wordsOneLetterAway(currWord, temp) ) {
				
				temp = wordChain.poll();
				
				if(temp == null)
					return "There is no ladder between " + beginWord + " and " + finalWord + "\n";
				
				currWord = temp.peek();
				
			} else
				break;

		}

		if (wordChain.isEmpty()) {
			return "There is no ladder between " + beginWord + " and " + finalWord + "\n";
		} else
			return "";
	}

	/**
	 * Goes through the dictionary text and puts each word into the dictionary hashset
	 * 
	 * @throws IOException	- to read in the file
	 */
	public void populateDictionary() throws IOException {
		Scanner scan = new Scanner(new File("dictionary.txt"));

		while (scan.hasNext()) {
			String currWord = scan.next();
			dictionary.add(currWord);
		}
	}

}