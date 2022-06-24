package com.nabin.jsd.service;

import com.nabin.jsd.DTO.CompanyDto;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
public interface CompanyService {
    CompanyDto save(CompanyDto companyDto);
    List<CompanyDto> findAll(CompanyDto companyDto);
}
