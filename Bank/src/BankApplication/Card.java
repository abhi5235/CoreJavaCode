package BankApplication;

public class Card {
	private String name;
	private int phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Cards [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}



}
