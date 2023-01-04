package com.kurdestanbootcamp.fileattachmentservice.file_attachment;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileAttachmentRepository extends PagingAndSortingRepository<FileAttachment,Long>, ListCrudRepository<FileAttachment, Long> {

FileAttachment findByEmployeeId(Long employeeId);
}
