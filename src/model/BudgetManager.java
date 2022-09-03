package model;

import java.math.BigInteger;

public class BudgetManager extends BillList {
	private BigInteger totalBalance; 

	public BigInteger getTotalBalance() {
		return this.totalBalance;
	}

	public BudgetManager(BigInteger balance, Bill... bills) {
		super(bills);
		this.totalBalance = balance;
	}

	@Override
	public String toString() {
		return this.totalBalance.toString() + "\n" + this.bills.toString();
	}
}
