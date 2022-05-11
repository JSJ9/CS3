
public class MinHeap {
	private Integer[] heap; // array backing the heap
	private int size; // logical size of the heap
	private static final int DEFAULT_CAPACITY = 8;

	public MinHeap() {
		size = 0;
		heap = new Integer[0];
	}

	public MinHeap(Integer[] r) {
		heap = r;

		for (int i = 0; i < r.length; i++)
			if (r[i] != null)
				size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int peekMinimum() {
		return heap[1];
	}

	public int getLeftChildIndex(int index) {
		return 2 * index + 1;
	}

	public int getRightChildIndex(int index) {
		return 2 * index + 2;
	}

	public int getParentIndex(int index) {
		return (index - 1) / 2;
	}

	// double the size of the array, not the logical size.. i think
	private void doubleCapacity() {
		int size = heap.length;
		Integer[] temp = new Integer[size * 2];

		for (int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}

		heap = temp;
	}

	public void insert(int value) {
		int count = 1;

		while (count < heap.length) {
			if (heap[count] != null) {
				count++;
			} else
				break;
		}

		heap[count] = value;
		bubbleUp(count);
	}

	private void bubbleUp(int index) 
	{
		if(heap[(index - 1) / 2] > heap[index])
		{
			Integer t = heap[(index - 1) / 2];
			heap[(index - 1) / 2] = heap[index];
			heap[index] = t;
		}
		else
			return;
	}
	
	public int popMinimum()
	{
		Integer min = heap[1];
		heap[1] = null;
		siftDown(1);
		return min;
	}
	
	private void siftDown(int index)
	{
		if(heap[getLeftChildIndex(index)] == null && heap[getRightChildIndex(index)] == null)
		{
			return;
		}
		else
		{
			
		}
	}
	

	@Override
	public String toString() {
		String output = "";
		for (int i = 1; i <= getSize(); i++)
			output += heap[i] + ", ";
		return output.substring(0, output.lastIndexOf(",")); // lazily truncate last comma
	}

	/**
	 * method borrowed with minor modifications from the internet somewhere, for
	 * printing
	 */
	public void display() {
		int nBlanks = 32, itemsPerRow = 1, column = 0, j = 1;
		String dots = "...............................";
		System.out.println(dots + dots);
		while (j <= this.getSize()) {
			if (column == 0)
				for (int k = 0; k < nBlanks; k++)
					System.out.print(' ');
			System.out.print((heap[j] == null) ? "" : heap[j]);
			if (++column == itemsPerRow) {
				nBlanks /= 2;
				itemsPerRow *= 2;
				column = 0;
				System.out.println();
			} else
				for (int k = 0; k < nBlanks * 2 - 2; k++)
					System.out.print(' ');
			j++;
		}
		System.out.println("\n" + dots + dots);
	}

}
