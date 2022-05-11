import java.util.LinkedList;

public class PhoneBook implements IMap
{
	private int hashTable[];
	private int entries[];
	private LinkedList<Entry>[] hashTablePhoneBook;
	
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
	
	@Override
	public PhoneNumber put(Person person, PhoneNumber phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhoneNumber get(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhoneNumber remove(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
