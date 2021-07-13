package prob1;

public enum AccountType {
	CHECKING("checking"), SAVINGS("saving"),RETIREMENT("retirement");
	
	private String value;
	
	AccountType (String value){
		this.value = value;		
	}
	
	public String getValue() {
		return this.value;
	}
}
