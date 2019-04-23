package com.tecnotree.revenue.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.tecnotree.revenue.repo.model.Bank;

@Repository
public interface EmployeeRepository extends CassandraRepository<Bank, String> {
}
