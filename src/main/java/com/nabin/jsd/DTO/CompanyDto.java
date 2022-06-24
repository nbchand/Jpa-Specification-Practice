package com.nabin.jsd.DTO;

import com.nabin.jsd.Entity.Company;
import com.nabin.jsd.Entity.Employee;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDto {
    private Integer id;
    private String name;
    private String address;
    private String field;

    public CompanyDto(Company company) {
        this.id = company.getId();
        this.name = company.getName();
        this.address = company.getAddress();
        this.field = company.getField();
    }

    public static List<CompanyDto> entityToDtoList(List<Company> companies) {
        return companies.stream().map(company -> new CompanyDto(company)).collect(Collectors.toList());
    }
}
