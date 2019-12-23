package com.example.DAO;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.model.Loan;

@Repository
public interface LoanDAO {
	Loan addLoan(Loan loan);
	List<Loan> getAllLoans();
	Loan updateLoan(String loanId,Loan loan);
	String deleteLoan(String loanId);
	List<Loan> get(String loan_type);
}
