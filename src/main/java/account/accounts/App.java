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
        
        Map<String, String>accountManager = new HashMap<String, String>(10, 0.5f);
		//Adding employee name and salary to map
//        accountManager.put();
//        accountManager.put();
//        accountManager.put();
//        accountManager.put();
//        accountManager.put();
//        accountManager.put(); 
//        
		
		System.out.println("Original Map: "+ accountManager);
//		accountManager.put();
//		accountManager.remove("Nidesh");
		System.out.println("Updated Map: "+accountManager);
		System.out.println(accountManager.keySet());
		System.out.println(accountManager.values());
	}
    }



	
		

