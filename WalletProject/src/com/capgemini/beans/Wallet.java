package src.com.capgemini.beans;

import java.math.BigDecimal;

public class Wallet {
	
	private BigDecimal balance;
	
	
	//Getter-Setter Methods
	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}

}