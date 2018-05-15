package maven;

public class Account {
	int accNumber;
	String name;
	String PAN;
	long aadhar;
	public Account(int accNumber, String name) {
		super();
		this.accNumber = accNumber;
		this.name = name;
	}
	public Account(int accNumber, String name, String PAN) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.PAN = PAN;
	}
	public Account(int accNumber, String name, String PAN, long aadhar) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.PAN = PAN;
		this.aadhar = aadhar;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String PAN) {
		this.PAN = PAN;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Account [accNumber=" + accNumber + ", name=" + name + ", PAN=" + PAN + ", aadhar=" + aadhar + "]";
	}
	
	

}
