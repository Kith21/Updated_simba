package com.example.model;

public class Loan {
	private String loan_id;
	private String loan_type;
	private String loan_irate;
	private String loan_desc;
	
	
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public String getLoan_irate() {
		return loan_irate;
	}
	public void setLoan_irate(String loan_irate) {
		this.loan_irate = loan_irate;
	}
	public String getLoan_desc() {
		return loan_desc;
	}
	public void setLoan_desc(String loan_desc) {
		this.loan_desc = loan_desc;
	}
	public String getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(String loan_id) {
		this.loan_id = loan_id;
	}

}
