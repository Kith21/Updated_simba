package com.example.DAO;

import java.util.List;

import com.example.model.Branch;

public interface BranchDAO {
	Branch registerBranch(Branch branch);
	List<Branch> getAllBranch();
	Branch updateBranch(Long branchId,Branch branch);
	Long deleteBranch(Long branchId);
}
