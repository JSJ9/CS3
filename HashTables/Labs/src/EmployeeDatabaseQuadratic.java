import java.util.Map;
import java.util.TreeMap;

public class EmployeeDatabaseQuadratic {
	private Entry[] hashTable;
	
	private class Entry
	{
		int ID;
		Employee employee;
		
		Entry()
		{
			ID = 0;
			employee = null;
		}
		
		Entry(int id, String hi)
		{
			ID = id;
			employee = new Employee(hi);
		}
		
		public String toString()
		{
			return ID + employee.toString();
		}

		
	}
	
	public EmployeeDatabaseQuadratic()
	{
		hashTable = new Entry[100000];
	}
}
