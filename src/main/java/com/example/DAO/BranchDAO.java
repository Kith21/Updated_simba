package com.example.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Branch;
@Repository
public interface BranchDAO {
	Branch registerBranch(Branch branch);
	List<Branch> getAllBranch();
	Branch updateBranch(String branchId,Branch branch);
	String deleteBranch(String branchId);
}
