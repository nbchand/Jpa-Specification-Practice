package com.nabin.jsd.service.impl;

import com.google.gson.Gson;
import com.nabin.jsd.DTO.CompanyDto;
import com.nabin.jsd.Entity.Company;
import com.nabin.jsd.repository.CompanyRepo;
import com.nabin.jsd.service.CompanyService;
import com.nabin.jsd.specification.CompanySpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepo companyRepo;
    private Gson gson = new Gson();

    @Override
    public CompanyDto save(CompanyDto companyDto) {
        return new CompanyDto(companyRepo.save(gson.fromJson(gson.toJson(companyDto), Company.class)));
    }

    @Override
    public List<CompanyDto> findAll(CompanyDto companyDto) {
        return CompanyDto.entityToDtoList(companyRepo.findAll( ));
    }
}
