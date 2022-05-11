import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class WordChain {
	private String beginWord;
	private String finalWord;
	private Queue<Stack<String>> wordChain;
	private HashSet<String> dictionary;
	private Stack<String> wordStack; //you are making copies of this
	
	/**
	 * Initializes all of the instance variables
	 * @throws IOException
	 */
	public WordChain() throws IOException
	{
		beginWord = "";
		finalWord = "";
		wordStack = new Stack<String>();
		wordChain = new LinkedList<Stack<String>>();
		dictionary = new HashSet<String>();
	}
	
	/**
	 * Calls the initializing constructor, but sets the begin and final word to the parameters. It also populates the current hashSet with all of the words in dictionary.
	 * @param n	- The beginning word parameter
	 * @param f	- the final word parameter
	 * @throws IOException
	 */
	public WordChain(String n, String f) throws IOException
	{
		this();
		beginWord = n;
		finalWord = f;
		wordStack.push(beginWord);
		wordChain.offer(wordStack);
		populateDictionary();
	}
	
	/**
	 * @return 	 the beginning word instance variable
	 */
	public String getBeginWord()
	{
		return this.beginWord;
	}
	
	/**
	 * @return	the final word instance variable
	 */
	public String getFinalWord()
	{
		return this.finalWord;
	}
	
	public boolean isInDict(String word)
	{
		return dictionary.contains(word);
	}
	
	//deep copy clone method
	/**
	 * Take in the beginning word, make a new String that is the all uppercase version of the word.
	 * Go through each index of the string and then replace the current index of the string with a character
	 * between 65 and 122. If it is in the dictionary, then we make a clone of the stackk and add the word that we found
	 * and enqueue that stack to the queue and "return".
	 * 
	 * This generates the stacks.
	 * @param stackk	- 
	 * @param bw
	 */
	public void wordsOneLetterAway(Stack<String> stackk, String bw)
	{
		String upperBw = bw.toUpperCase();
		
		for(int i = 0; i < bw.length(); i++)
		{
			for(int x = 65; x < 97; x++)
			{
				String temp = (char) x + upperBw.substring(i);
				
				if(isInDict(temp) && !temp.toLowerCase().equals(beginWord))
				{
					Stack<String> tempStack = new Stack<String>();
					
					tempStack.addAll(wordStack);
					tempStack.push(temp.toLowerCase());
					wordChain.offer(tempStack);
				}
			}
		}
	}
	
	/**
	 * We take a temporary stack that is a copy of wordStack. we get the current word in 
	 * the stack by peeking. We then do a while for as long as the currentWord does NOT 
	 * equal the final word or it is not null. While this is true, WOLA would be called.
	 * If false, we check if the queue is empty and if true, we return that there is no
	 * ladder. If false, we return the temporary stack, which would contain the ladder.
	 * @return
	 */
	public String areWeDoneYetOrReachedTheEndOfThisComplicatedProgramGameToy()
	{
		Stack<String> temp = wordChain.poll();
		System.out.println("temp stack: " + temp);
		String currWord = temp.peek();
		System.out.println("currWord: " + currWord);
		
		while(!currWord.equals(finalWord) || currWord != null)
		{
			 wordsOneLetterAway(temp, currWord);
			 currWord = wordChain.poll().peek();
//			 System.out.println("current word in while: " + currWord);
		}
		
		//this is where we check if there is a ladder
		if(wordChain.isEmpty())
			return "There is no ladder between " + beginWord + " and " + finalWord;
		else
			return temp.toString();
	}
	
	/**
	 * Goes through the dictionary and puts each word into the dictionary hashset
	 * @throws IOException
	 */
	public void populateDictionary() throws IOException
	{
		Scanner scan = new Scanner(new File("dictionary.txt"));
		
		while(scan.hasNext())
		{
			String currWord = scan.next();
			dictionary.add(currWord);
		}
	}
	
	@Override
	public String toString()
	{
		return "dictionary: " + dictionary.size();
	}
	
}
