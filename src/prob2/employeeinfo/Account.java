package prob2.employeeinfo;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	@Override
	public String toString() {
		return "Account type: " + acctType + "\n"+ "Current bal: " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount <= balance) {
			this.balance -=amount;
			return true;
		}
		else {
		return false;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	public AccountType getAcctType() {
		return this.acctType;
	}
	
	
}
