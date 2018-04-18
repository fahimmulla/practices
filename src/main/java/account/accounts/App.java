package account.accounts;

import java.util.HashMap;
import java.util.Map;
import org.json. *;
import com.google.gson.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      service application = new service();
      
      application.addAccounts("Fahim","Mulla","567");
//      application.addAccounts("Tom","hugh","5627");
//      application.addAccounts("Nick","Morgan","5167");
      
//      application.newMap();
      
      
      
      
      Gson gson = new Gson(); 
      String json = gson.toJson(application.accountManager);
      System.out.println(json);
      
    }

    
    
    
    
    
    
    
    
    
}

	
		

