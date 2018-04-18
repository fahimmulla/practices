package account.accounts;

public class account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public account(String firstName2, String lastName2, String accountNumber2) {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String toString() {
		return "first Name: " + firstName  + "lastName :" + lastName + "accountNumber" + accountNumber; 
	}
}
