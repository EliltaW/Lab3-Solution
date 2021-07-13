package prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Elilta Wondimu","Mita",150000.00,2022,06,30);
		Account checkingAccount = new Account(employee,AccountType.CHECKING,300);
		Account savingAccount = new Account(employee,AccountType.SAVINGS,300);
		Account retirmentAccount = new Account(employee,AccountType.RETIREMENT,300);
		System.out.println(checkingAccount.toString());
		System.out.println(savingAccount.toString());
		System.out.println(retirmentAccount.toString());
		System.out.println(employee.toString());

		
		//Account(employee,AccountType.CHECKING,300);
	}

}
