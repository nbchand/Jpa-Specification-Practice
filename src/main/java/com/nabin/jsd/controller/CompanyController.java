package com.nabin.jsd.controller;

import com.nabin.jsd.DTO.CompanyDto;
import com.nabin.jsd.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDto> save(@RequestBody CompanyDto companyDto) {
        return ResponseEntity.ok(companyService.save(companyDto));
    }

    @PostMapping("/all")
    public ResponseEntity<List<CompanyDto>> findAll(@RequestBody CompanyDto companyDto) {
        return ResponseEntity.ok(companyService.findAll(companyDto));
    }
}
