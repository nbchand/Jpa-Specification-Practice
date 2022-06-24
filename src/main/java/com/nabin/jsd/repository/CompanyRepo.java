package com.nabin.jsd.repository;

import com.nabin.jsd.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
public interface CompanyRepo extends JpaRepository<Company, Integer>, JpaSpecificationExecutor<Company> {
}
