public class Tour
{
	private Node tourList;
	private Node head;
	private int size;

	/** create an empty tour */
	public Tour()
	{
		tourList = null;
		head = null;
	}

	/** create a four-point tour, for debugging */
	public Tour(Point a, Point b, Point c, Point d)
	{
		Point[] points = { a, b, c, d };

		head = new Node(points[0]);
		Node temp = head;

		for (int i = 1; i < points.length; i++)
		{
			temp.next = new Node(points[i]);
			temp = temp.next;
		}

		temp = head;

	}

	public void insertInOrder(Point p)
	{
		size++;
		Node temp = head;

		if (head == null)
		{
			head = new Node(p);
		}
		while (temp != null)
		{
			temp = temp.next;
		}

	}

	/** print tour (one point per line) to std output */
	public void show()
	{
		Node temp = head;

		while (temp != null)
		{
			System.out.println(temp.p.toString());
			temp = temp.next;
		}

	}

	/** draw the tour using StdDraw */
	public void draw()
	{
		Node temp = head;

		while (temp != null && temp.next != null)
		{
			temp.p.draw();
			temp.p.drawTo(temp.next.p);
			temp = temp.next;
		}

		temp.p.drawTo(head.p);
	}

	/** return number of nodes in the tour */
	public int size()
	{
		return size;
	}

	/**
	 * return the total distance "traveled", from start to all nodes and back to
	 * start
	 */
	public double distance()
	{
		double distance = 0;

		Node temp = head;

		while (temp != null && temp.next != null)
		{
			distance += temp.p.distanceTo(temp.next.p);
			temp = temp.next;
		}

		distance += temp.p.distanceTo(head.p);

		return distance;

	}

	/** insert p using nearest neighbor heuristic */
	public void insertNearest(Point p)
	{
		Node newNode = new Node(p);

		if (size == 0)
		{
			head = newNode;
			head.next = null;
		} else
		{
			Node curr = head;
			System.out.println(curr);
			Node closestNode = null;
			double leastDist = Double.MAX_VALUE;
			while (curr != null)
			{
				double dist = curr.p.distanceTo(newNode.p);

				if (dist < leastDist)
				{
					leastDist = dist;
					closestNode = curr;
				}

				curr = curr.next;
				System.out.println("end of while: " + curr);
			}

			curr = closestNode.next;
			newNode.next = curr;
			closestNode.next = newNode;
		}

		size++;
	}

	/** insert p using smallest increase heuristic */
	public void insertSmallest1(Point p)
	{
		Node newNode = new Node(p);
		System.out.println("help");
		if(size == 0)
		{
			System.out.println("H");
			head = newNode;
			head.next = head;
		}
		else
		{
			double smallestDiff = Double.MAX_VALUE;
			Node curr = head;
			Node closestNode = null;
			System.out.println("W");
			while(curr != null)
			{
				System.out.println("this is running multiple times");
				double d1 = curr.p.distanceTo(newNode.p) + newNode.p.distanceTo(curr.next.p);
				double d2 = curr.p.distanceTo(curr.next.p);
				double diff = d1 - d2;
				
				if(diff < smallestDiff)
				{
					smallestDiff = diff;
					closestNode = curr;
				}
				
				curr = curr.next;
			}
			
//			curr = closestNode.next;
			newNode.next = closestNode;
			curr.next = newNode;
//			closestNode.next = newNode;
		}
		
		size++;
		
	}


	private class Node
	{
		Point p;
		Node next;

		Node(Point p)
		{
			this.p = p;
		}
	}
	
//	public static void main(String[] args) {
//		 //define 4 points forming a square
//		 Point a = new Point(100.0, 100.0);
//		 Point b = new Point(500.0, 100.0);
//		 Point c = new Point(500.0, 500.0);
//		 Point d = new Point(100.0, 500.0);
//		 StdDraw.setXscale(0, 600);
//		 StdDraw.setYscale(0,600);
//		 Tour squareTour = new Tour(a, b, c, d);
//		 squareTour.show();
//		 System.out.println(squareTour.distance());
//		 squareTour.draw();
//		}

}