package account.accounts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class service {
	
	static int count = 1;

	Map<Integer, account> accountManager = new HashMap<Integer, account>();
	
	public Map<Integer, account> addAccounts (String firstName, String lastName, String accountNumber) {
		
		
		
		account accounts = new account(firstName, lastName, accountNumber);
		accountManager.put(count, accounts);
		count++;
		return accountManager;
		
		
	}
	
	public void getAccounts(account accounts) {
		accounts.toString();
	
	}
	
	public void newMap() {
		Set<Entry<Integer, account>> hashSet=accountManager.entrySet();
		for(Entry entry:hashSet) {
			
			System.out.println(entry.getKey()+ ", "+ entry.getValue());
		}
	}
	
	public void showEntry(int num) {
		Set<Entry<Integer, account>> hashSet=accountManager.entrySet();
		for(Entry entry:hashSet) {
			int key = (Integer) entry.getKey();
        	if(key==num) {
        		System.out.println(entry.getKey()+ ", " + entry.getValue());
		}
		}
	}
	
}



