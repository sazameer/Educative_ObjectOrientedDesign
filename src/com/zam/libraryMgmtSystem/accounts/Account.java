package com.zam.libraryMgmtSystem.accounts;

import com.zam.libraryMgmtSystem.constants.AccountStatus;

public abstract class Account {
	
	private String userId;
	private String password;
	private AccountStatus accountStatus;
	private Person person;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public boolean resetPassword() {
		System.out.println("Reset Password Link Sent to you email address");
		return false;
	};

}
