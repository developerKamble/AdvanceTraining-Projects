package com.coreproject1;
/*
 * Create a classBankAccounthaving the members as given below:
 * Have constructor to which you will pass, accNo, custName, acctype and initial balance.
 * •And check whether the balance is less than 1000 or not in case of savings account and less than 5000 in case of a current account. 
 *  If so, then raise a LowBalanceException.
 * •In either case if the balance is negative then raise the NegativeAmountExceptionaccordingly
 * */
public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	
		public int getAccNo() {
		return accNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getAccType() {
		return accType;
	}
	public BankAccount(int accNo, String custName, String accType, float balance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	public void deposit(float amt) {
		
	}
	public void withdraw(float amt) {
		
	}
	public float getBalance() {
		
		return balance;
		
	}
}
