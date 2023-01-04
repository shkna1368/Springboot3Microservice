package com.kurdestanbootcamp.familyservice.family;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FamilyRepository extends PagingAndSortingRepository<Family,Long>, ListCrudRepository<Family, Long> {
List<Family> findAllByEmployeeId(Long employeeId);


}
