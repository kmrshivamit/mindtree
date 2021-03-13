
public class Payment {
private long id;
private static long idStart=1000;
private String customerName;
private double amountPaid;
private String cardType;
public Payment( String customerName, double amountPaid, String cardType, String expiryDate, String cardNumber) {
	super();
	setId();
	this.customerName = customerName;
	this.amountPaid = amountPaid;
	this.cardType = cardType;
	this.expiryDate = expiryDate;
	this.cardNumber = cardNumber;
}
private String expiryDate;
private String cardNumber;
public String getCardNumber() {
	String str="";
	
	for(int i=6;i<=9;i++)
		str+=str.charAt(i);
	return str;
}
public void setCardNumber(String cardNuber) {
	
	this.cardNumber = cardNuber;
}

public long getId() {
	return id;
}
public void setId() {
	this.id = idStart++;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public double getAmountPaid() {
	return amountPaid;
}
public void setAmountPaid(double amountPaid) {
	this.amountPaid = amountPaid;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
@Override
public String toString() {
	return "Payment [id=" + id + ", customerName=" + customerName + ", amountPaid=" + amountPaid + ", cardType="
			+ cardType + ", expiryDate=" + expiryDate + ", getCardNumber()=" + getCardNumber() + "]";
}

}
