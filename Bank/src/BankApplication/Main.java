package BankApplication;

public class Main 
{
public static void main(String[] args)
{
	CreditCardCustomer cc=new CreditCardCustomer();
	DebitCardCustomer dc=new DebitCardCustomer();
	cc.setCreditCardLimit(20000);
	cc.setName("Abhishek");
	dc.setDebitcardLimit(100000);
	dc.getPhoneNumber();
	System.out.println(cc.getName());
	System.out.println(cc.getCreditCardLimit());
	System.out.println(dc.getPhoneNumber());
	System.out.println(dc.getDebitcardLimit());
}
}