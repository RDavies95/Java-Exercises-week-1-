package Main;

import java.util.ArrayList;

public class Library {

	// ArrayLists for Person and Item
	ArrayList<Person> pAL = new ArrayList<Person>();
	ArrayList<Item> iAL = new ArrayList<Item>();

	ArrayList<String> itemsOut = new ArrayList();
	
	
	// Register Person
	public void registerPerson(Person p) {
		pAL.add(p);
		System.out.println(p.pName + " has been successfully added");
	}

	// Remove Person
	public void removePerson(int id) {
		for (int i = 0; i < pAL.size(); i++) {
			Person p = pAL.get(i);

			if (id == p.pId) {
				pAL.remove(i);
			}
		}
		System.out.println("Person succesffuly removed");
	}

	// Update Person
	public void updatePerson(int pId, String pName, int pAge, String pOccupation, String pAddress) {
		for (int i = 0; i < pAL.size(); i++) {
			Person p = pAL.get(i);

			if (pId == p.pId) {

				pAL.get(i).setpName(pName);
				pAL.get(i).setpAge(pAge);
				pAL.get(i).setpOccupation(pOccupation);
				pAL.get(i).setpAddress(pAddress);

			}
		}
		System.out.println("Person succesffuly updated");
	}
	
	// Add Item
	public void addItem(Item i)
	{
		iAL.add(i);
		System.out.println(i.iName + " has been successfully added");
	}
	
	
	public void removeItem(int id)
	{
		for (int i = 0; i < iAL.size(); i++) {
			Item j = iAL.get(i);

			if (id == j.iId) {
				pAL.remove(i);
			}
		}
		System.out.println("Item succesffuly removed");
	}
	
	
	public void outputPerson()
	{
		for(Person p : pAL)
		{
			System.out.println(p);
		}
	}
	
	public void outputItem()
	{
		for(Item i : iAL)
		{
			System.out.println(i);
		}
	}
	
	
	public void checkOutItem(int pId, int iId)
	{
		String itemTakenOut = Integer.toString(pId) + Integer.toString(iId);
		itemsOut.add(itemTakenOut);
		
	}
	
	public void outputCheckedOutItems()
	{
		for(int i = 0; i < itemsOut.size(); i++)
		{
			System.out.println(itemsOut.get(i));
		}
	}
	

}
