package com.kurdestanbootcamp.postemployeeservice.post_employee;


import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PostEmployeeRepository extends PagingAndSortingRepository<PostEmployee,Long>,ListCrudRepository<PostEmployee, Long> {

List<PostEmployee> findAllByPostId(Long postId);
List<PostEmployee> findAllByEmployeeId(Long employeeId);
}
