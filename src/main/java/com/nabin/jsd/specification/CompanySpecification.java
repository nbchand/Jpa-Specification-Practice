package com.nabin.jsd.specification;

import com.nabin.jsd.DTO.CompanyDto;
import com.nabin.jsd.Entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Narendra
 * @version 1.0
 * @since 2022-06-24
 */
@RequiredArgsConstructor
public class CompanySpecification implements Specification<Company> {

    private final CompanyDto companyDto;

    @Override
    public Predicate toPredicate(Root<Company> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicateList = new ArrayList<>();

        if (companyDto.getName() != null) {
            Path<String> name = root.get("name");
            Predicate predicate = criteriaBuilder.like(name, "%" + companyDto.getName() + "%");
            predicateList.add(predicate);
        }
        if (companyDto.getAddress() != null) {
            Path<String> address = root.get("address");
            Predicate predicate = criteriaBuilder.like(address, "%" + companyDto.getAddress() + "%");
            predicateList.add(predicate);
        }
        if (companyDto.getField() != null) {
            Path<String> field = root.get("field");
            Predicate predicate = criteriaBuilder.like(field, "%" + companyDto.getField() + "%");
            predicateList.add(predicate);
        }
        return criteriaBuilder.and(predicateList.toArray(new Predicate[0]));
    }
}
