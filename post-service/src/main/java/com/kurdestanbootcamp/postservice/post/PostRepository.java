package com.kurdestanbootcamp.postservice.post;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post,Long> , ListCrudRepository<Post, Long> {


}
