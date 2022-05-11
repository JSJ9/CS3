import java.util.Map;
import java.util.TreeMap;

public class EmployeeDatabaseLinear {
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
		
		public int getID()
		{
			return ID;
		}
		
		public String getEmployee()
		{
			return employee.toString();
		}
		public String toString()
		{
			return ID + employee.toString();
		}

		
	}
	
	public EmployeeDatabaseLinear()
	{
		hashTable = new Entry[100000];
	}
	
	public int hashCode(int key)
	{
		return key % hashTable.length;
	}
	
	public Entry put(int key, String value)
	{
		int hash = hashCode(key);
		
		if(hashTable[hash] == null)
			hashTable[hash] = new Entry(key, value);
		else
		{
			for(int i = hash+1; i < hashTable.length; i++)
			{
				if(hashTable[i] != null)
				{
					hashTable[i] = new Entry(key, value);
					break;
				}
			}
		}
		
		return new Entry(key, value);
	}
	
	public String get(int key)
	{
		int hash = hashCode(key);
		
		if(hashTable[hash].getID() == key)
		{
			return hashTable[hash].toString();
		}
		else
		{
			for(int i = hash+1; i < hashTable.length; i++)
			{
				if(hashTable[hash].getID() == key)
				{
					return hashTable[hash].toString();
				}
				else if(hashTable[hash] == null)
					return "null";
			}
		}
		return "null";
	}
}
