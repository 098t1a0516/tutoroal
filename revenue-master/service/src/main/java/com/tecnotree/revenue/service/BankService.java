package com.tecnotree.revenue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tecnotree.revenue.repo.EmployeeRepository;
import com.tecnotree.revenue.repo.model.Bank;
import com.tecnotree.revenue.service.exception.EntityNotFoundException;

@Service
public class BankService {

	@Autowired
	private EmployeeRepository bankRepository;
	PageRequest firstReq = null;
    @Transactional
	public List<Bank> getBanks(int pageNo, int perPage) throws EntityNotFoundException {
    	Slice<Bank> page = null;
    	if(firstReq == null ) {
        	firstReq = PageRequest.of(pageNo, perPage);
        	page = bankRepository.findAll(firstReq);
    	} else {
    		page = bankRepository.findAll(firstReq.next());
    	}
		return page.getContent();
	}
}
