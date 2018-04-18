package account.accounts;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Map<String,Integer>accountManager = new HashMap<String, Integer>(10, 0.5f);
		//Adding employee name and salary to map
        accountManager.put("Ed", 1002);
        accountManager.put("Fahim", 20220);
        accountManager.put("Nic", 320);
        accountManager.put("Nidesh", 101);
        accountManager.put("John cena", 151);
        accountManager.put("Rakesh", 10122); 
        
		
//		System.out.println("Original Map: "+ accountManager);
//		accountManager.put("Dwayne", 2211);
//

		
		
		
		accountManager.remove("Nidesh");
		System.out.println("Updated Map: "+accountManager);
		System.out.println(accountManager.keySet());
		System.out.println(accountManager.values());
	}
    }



	
		

