package account.accounts;

public class account {

	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public account(String firstName, String lastName, String accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public String toString() {
		return "first Name: " + firstName +"       " + "lastName :" + lastName  +"            " + "accountNumber" + accountNumber; 
	}
}