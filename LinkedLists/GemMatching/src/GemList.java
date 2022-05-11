
public class GemList 
{
	private ListNode head;
	private ListNode tail;
	private int size;
	
	
	public GemList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	public int size()
	{
		return size;
	}
	
	public void draw(double y)
	{
		ListNode curr = head;
		int indx = 0;
		while(curr != null)
		{
			curr.val.draw(GemGame.indexToX(indx), y);
			curr = curr.next;
			indx++;
		}
	}

	
	public void insertBefore(Gem gem, int index)
	{
		
		ListNode gemm = new ListNode(gem);
		int count = 0;
		
		if(index >= size)
			index = size-1;
		if(index <= 0)
		{
			gemm.next = head;
			head = gemm;
			size++;
		}else if(index == 0)
		{
			head.next = gemm;
			size++;
		}
		else
		{
			ListNode curr = head;

			while(curr.next != null)
			{
				if(count == index-1)
				{
					gemm.next = curr.next;
					curr.next = gemm;
					size++;
					break;
				}
				
				count++;
				curr = curr.next;
			}

		}
	}
	
	public int score()
	{
		int score = 0;
		
		if(size != 0)
		{
			ListNode curr = head;
			GemType headGemType = head.val.getType();
			int tempScore = 0;
			int consec = 0;
			
			while(curr != null)
			{
				Gem currGem = curr.val;
				
				if(currGem.getType() == headGemType)
				{
					consec++;
					tempScore += currGem.getPoints();
				}
				else
				{
					score += tempScore * consec;
					headGemType = curr.val.getType();
					tempScore = currGem.getPoints();
					consec = 1;
					
				}
				curr = curr.next;
			}
			
			score += tempScore * consec;
		}
		
		return score;
	}
	
	private class ListNode {
		Gem val;
		ListNode next;

		public ListNode(Gem val) {
			this.val = val;
		}

		
		@Override
		public String toString() {
			return "" + this.val.toString();
		} // for printing / debug
	}
	
	@Override
	public String toString()
	{
		String output = "";
		
		if(head == null)
		{
			output = "<none>";
			return output;
		}
		
		ListNode curr = head;
		
		while(curr != null)
		{
			output += curr.toString() + " ";
			
			if(curr.next != null)
				output += "-> ";
			
			curr = curr.next;
		}
		
		return output;
		
	}
	
	public static void main(String [] args)
	{
		GemList list = new GemList();
		System.out.println(list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.9);		
		
		list.insertBefore(new Gem(GemType.BLUE, 10), 0);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.8);
		
		list.insertBefore(new Gem(GemType.BLUE, 20), 99);  //not a mistake, should still work
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.7);
		
		list.insertBefore(new Gem(GemType.ORANGE, 30), 1);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.6);
		
		list.insertBefore(new Gem(GemType.ORANGE, 10), 2);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.5);
		
		list.insertBefore(new Gem(GemType.ORANGE, 50), 3);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.4);
		
		list.insertBefore(new Gem(GemType.GREEN, 50), 2);
		System.out.println("\n" + list);
		System.out.println("size = " + list.size() + ", score = " + list.score());
		list.draw(0.3);		
	}	
}
