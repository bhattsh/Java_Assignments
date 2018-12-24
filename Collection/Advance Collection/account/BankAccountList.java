package account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


/**
 * 
 * @author Shubham Bhatt
 *class to serialize and deserialize saving account object
 */
public class BankAccountList 
{
	/**
	 * method to serialize objects of SavingAccountClass stored in a List with
	 * duplicate elements also
	 * 
	 * @param listOfSavingAccounts
	 * @param file
	 * @throws IOException
	 */
	public void serializeSavingAccount(List<SavingAccount> listOfSavingAccounts, String file)throws IOException 
	{
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

		objectOut.writeObject(listOfSavingAccounts);

		objectOut.close();
		fileOut.close();
	}

	
	/**
	 * method to serialize saving account but without duplicates
	 * 
	 * @param listOfSavingAccounts
	 * @param file
	 * @throws IOException
	 */
	public void serializeSavingAccountWithoutDuplicates(List<SavingAccount> listOfSavingAccounts, String file)throws IOException
	{
		TreeSet<SavingAccount> setOfAccounts = new TreeSet<SavingAccount>(listOfSavingAccounts);
		
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

		objectOut.writeObject(setOfAccounts);

		objectOut.close();
		fileOut.close();
	}

	
	/**
	 * method to Deserialise objects of SavingAccount class
	 * 
	 * @param fileContainingObjects
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Collection deserializeSavingAccount(String fileContainingObjects)throws IOException, ClassNotFoundException 
	{
		FileInputStream fileIn = new FileInputStream(fileContainingObjects);
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);

		Collection listOfSavingAccounts = (Collection) objectIn.readObject();
		
		return listOfSavingAccounts;
	}

}
