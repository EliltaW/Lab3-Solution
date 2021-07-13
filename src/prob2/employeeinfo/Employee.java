package prob2.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS,startAmount  );
		
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this,AccountType.RETIREMENT, startAmount);
		
	}

	public String getFormattedAcctInfo() {
		
		return "ACCOUNT INFO FOR " + this.name + ":" +"\n\n"+ 
		(this.checkingAcct!=null ? this.checkingAcct.toString():"")+
		(this.savingsAcct!=null ? this.savingsAcct.toString():"") + 
		(this.retirementAcct!=null ? this.retirementAcct.toString():"")+"\n";
	}
	public void deposit(String acctType, double amt){
		if(AccountType.CHECKING.getValue().equals(acctType)) {
			checkingAcct.makeDeposit(amt);
		}
		else if(AccountType.SAVINGS.getValue().equals(acctType)) {
			savingsAcct.makeDeposit(amt);
		}
		else if(AccountType.RETIREMENT.getValue().equals(acctType)) {
			retirementAcct.makeDeposit(amt);
		}
	
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		if(AccountType.CHECKING.getValue().equals(acctType)) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(AccountType.SAVINGS.getValue().equals(acctType)) {
			return savingsAcct.makeWithdrawal(amt);
		}
		else if(AccountType.RETIREMENT.getValue().equals(acctType)) {
			return retirementAcct.makeWithdrawal(amt);
		}
		return false;
	
	}
	public String getName() {
		return this.name;
	}
	public LocalDate getHiredate() {
		return this.hireDate;
	}

}
